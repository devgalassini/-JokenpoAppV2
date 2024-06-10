buildscript {
    repositories {
        google()
        mavenCentral() // It's a good practice to include Maven Central as well
    }
    dependencies {
        val navVersion = "2.6.0" // Using 'val' instead of 'def' for Kotlin
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

// Make sure the 'libs' object is defined properly somewhere in your project
