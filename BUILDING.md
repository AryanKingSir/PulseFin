# Building PulseFin

This document contains instructions for setting up the development environment, compiling PulseFin from source, and creating release builds.

---

## Prerequisites

- **JDK 21**: Android Studio's bundled JBR is recommended.
  ```sh
  export JAVA_HOME="/Applications/Android Studio.app/Contents/jbr/Contents/Home"  # macOS
  ```
- **Android SDK**: Compile SDK 35, Min SDK 31 (Android 12+).
- **A Jellyfin Server**: Any reachable instance of Jellyfin (10.8+) for running and testing against a real library.

---

## Building from Source

### Debug Build

To compile and assemble the debug APK:

```sh
./gradlew :app:assembleDebug
```

The resulting APK will be located at:
`app/build/outputs/apk/debug/app-debug.apk`

You can install it directly onto a connected device or running emulator:

```sh
./gradlew :app:installDebug
```

---

## Release Builds & Signing

PulseFin uses automated release signing via GitHub Actions when a release tag (`v*.*.*`) is pushed.

For local release builds:
- If no keystore is configured, `./gradlew :app:assembleRelease` falls back to debug signing so release-mode performance and ProGuard/R8 optimizations can still be tested locally.
- To sign with a production keystore, configure `keystore.properties` or set the appropriate environment variables (`RELEASE_STORE_FILE`, `RELEASE_STORE_PASSWORD`, etc.).

For detailed instructions on configuring keystores, see [docs/RELEASE_SIGNING.md](docs/RELEASE_SIGNING.md).

---

## Project Architecture

PulseFin is structured as a modular Gradle project:

| Module | Role |
| :--- | :--- |
| `:app` | UI layer with Jetpack Compose, navigation, screen ViewModels, and UI state |
| `:core:domain` | Pure Kotlin repository interfaces, domain models, and business logic (no Android framework dependencies) |
| `:core:data` | Jellyfin API integration ([official Kotlin SDK](https://github.com/jellyfin/jellyfin-sdk-kotlin)), Room database cache/mirror, session & settings storage |
| `:core:playback` | Media3 / ExoPlayer playback engine, background audio service, download manager, and queue persistence |
| `:core:designsystem` | Material 3 Expressive theme, typography, color schemes, and custom artwork shapes |
| `:core:common` | Shared utilities, coroutine dispatchers, and extensions |

### Key Technologies
- **UI**: Jetpack Compose, Material 3 Expressive, Shared Element Transitions
- **Playback**: AndroidX Media3 (ExoPlayer) + MediaSession
- **Dependency Injection**: [Koin](https://insert-koin.io/)
- **Local Storage**: Room + DataStore Preferences
