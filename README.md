# 📱 KMP Task Manager

A **Kotlin Multiplatform Mobile (KMP)** project designed to demonstrate mobile development workflows using Git, GitHub strategies. This app supports **cross-platform task management** for both Android and iOS.

---

## 📦 Features

- 📄 Task listing, details, and creation
- 🤖 Android UI with Jetpack Compose
- 🍏 iOS UI with SwiftUI
- 🧠 Shared business logic using KMP `commonMain`
- 💾 Platform-specific database implementations
- 🔔 Mobile notifications for both platforms
- 🌐 Shared network layer in progress

---

## 🔧 Project Structure

```text
kmp-task-manager/
├── shared/
│   └── src/
│       ├── commonMain/kotlin/
│       ├── androidMain/kotlin/
│       └── iosMain/kotlin/
├── androidApp/
│   └── src/main/kotlin/
├── iosApp/
│   └── ContentView.swift