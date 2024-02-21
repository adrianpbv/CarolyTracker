plugins {
    `android-library`
    `kotlin-android`
}

apply {
    from("$rootDir/compose-module.gradle")
}

android {
    // contains ui elements that are shared across other modules
    namespace = "com.example.core_ui"
}