# Android Accessibility Assistant SDK

## 📦 Registry & Repository

- **Maven Central**: [io.github.amitgaikwad2837:android-accessibility-assistant-sdk](https://central.sonatype.com/artifact/io.github.amitgaikwad2837/android-accessibility-assistant-sdk)
- **GitHub**: [amitgaikwad2837/android-accessibility-assistant-sdk](https://github.com/amitgaikwad2837/android-accessibility-assistant-sdk)

## Overview

AI-powered accessibility features including screen explanation and voice-guided navigation. Enables blind, low vision, and elderly users to interact with apps independently through enhanced accessibility.

## Installation

Add the Maven dependency:

~~~kotlin
dependencies {
  implementation("io.github.amitgaikwad2837:android-accessibility-assistant-sdk:0.0.9")
}
~~~

## Integration Example

~~~kotlin
import com.sdk.accessibility.AccessibilityAssistantSDK

class ExampleUsage {
    fun setup() {
        val sdk = AccessibilityAssistantSDK()
        // Configure and call SDK APIs here based on your app flow.
    }
}
~~~

## Feature Highlights

- screen-explanation
- voice-navigation
- accessibility-overlay
- wcag-scoring
- context-aware-guidance
- ai-assisted-navigation

## Android Permissions

- BIND_ACCESSIBILITY_SERVICE
- INTERNET

## Development

~~~bash
./gradlew build
./gradlew test
~~~

## License

MIT
