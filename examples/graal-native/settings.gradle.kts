pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}
plugins {
  id("com.gradle.enterprise") version "3.16.1"
  id("com.gradle.common-custom-user-data-gradle-plugin") version "1.12.1"
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}

apply(from = "../../gradle/gradle-enterprise.gradle")

rootProject.name = "graal-native"
