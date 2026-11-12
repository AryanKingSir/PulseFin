# PulseFin

PulseFin is a modern, native Android music client designed specifically for self-hosted [Jellyfin](https://jellyfin.org/) media servers. Built from the ground up with Jetpack Compose and Material 3 Expressive, PulseFin brings your personal music collection to life with fluid animations, adaptive colors, and an intuitive user experience.

<p align="center">
  <img src="docs/images/home.png" width="180" alt="Home screen" />
  <img src="docs/images/now-playing.png" width="180" alt="Now Playing screen" />
  <img src="docs/images/albums.png" width="180" alt="Albums grid" />
  <img src="docs/images/playlists.png" width="180" alt="Playlists" />
  <img src="docs/images/settings.png" width="180" alt="Settings screen" />
</p>

<p align="center">
  <a href="https://github.com/Funnykid7/PulseFin/releases/latest"><img src="https://img.shields.io/github/v/release/Funnykid7/PulseFin?color=6366f1&label=Latest%20Release" alt="Latest Release"></a>
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-GPL--3.0-blue.svg" alt="License: GPL-3.0"></a>
  <a href="https://funnykid7.github.io/PulseFin/"><img src="https://img.shields.io/badge/Website-PulseFin-indigo" alt="Website"></a>
</p>

---

## Highlights

### 🎨 Material 3 Expressive Design
- **Per-Track Dynamic Theming** — The player dynamically samples color palettes from the active album artwork, styling playback controls, gradients, and backgrounds specifically for each track.
- **Customizable Artwork Rounding** — Fine-tune album cover corners to your visual preference, from subtle squircle rounding to full pills and circles.
- **Seamless Motion** — Shared-element transitions glide album artwork smoothly between list views and the full-screen player.
- **Tactile Haptics** — Subtle, satisfying vibrational feedback across playback controls, sliders, and favorites.

### 🎵 Your Music, Your Way
- **Complete Library Browsing** — Quickly access your personalized **Your Mix**, full album catalog, artists, tracks, and genre collections.
- **Server-Synced Playlists** — Create, reorder, edit, and manage playlists that stay perfectly in sync with your Jellyfin server and other clients.
- **Queue Management** — Full drag-and-drop queue reordering, "Play Next", and instant queue persistence across app and phone restarts.
- **Synced Lyrics** — Read along with embedded and server-provided synchronized lyrics.
- **Instant Scrobbling** — Automatically reports playback progress back to your Jellyfin server so "Continue Listening" and play counts are always accurate.

### 💾 Offline Downloads
- Save songs and full albums directly to your device for offline playback on commutes or flights.
- Optional Wi-Fi only download restriction to save mobile data.
- Built-in storage manager in Settings to view and clear cached and downloaded music.

### 🔒 100% Private & Self-Hosted
- No accounts to create, no third-party tracking, and zero telemetry.
- Direct connection between your phone and your Jellyfin instance — your data never touches any external servers.

---

## Requirements

- **Jellyfin Server**: Version 10.8 or newer (requires your server URL and login credentials).
- **Android Device**: Android 12 (API 31) or newer.

---

## Installation

Grab the latest APK directly from the [GitHub Releases](https://github.com/Funnykid7/PulseFin/releases/latest) page or visit the [PulseFin Website](https://funnykid7.github.io/PulseFin/).

---

## Development & Building

PulseFin is fully open-source. For instructions on prerequisites, local compilation, and release packaging, please refer to [BUILDING.md](BUILDING.md).

---

## License

PulseFin is licensed under the **GNU General Public License v3.0** (GPL-3.0). See [LICENSE](LICENSE) for details.

## Disclaimer

PulseFin is an independent, community-developed client and is not officially affiliated with or endorsed by the Jellyfin project.
