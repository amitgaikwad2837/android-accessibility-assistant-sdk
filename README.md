# Android Accessibility Assistant SDK

## Overview

Screen explanation and voice-guided navigation for elderly users

## Installation

Add the Maven dependency once artifacts are published:

~~~kotlin
dependencies {
  implementation("io.github.amitgaikwad2837:android-accessibility-assistant-sdk:1.0.0")
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
