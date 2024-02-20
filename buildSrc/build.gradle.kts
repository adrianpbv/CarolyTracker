import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    // Kotlin-Gradle version
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20")
    // Tools-Gradle version
    implementation("com.android.tools.build:gradle:8.1.1")
}


val compileKotlin: org.jetbrains.kotlin.gradle.tasks.KotlinCompile by tasks
// Java version
compileKotlin.kotlinOptions {
    jvmTarget = "18"
}