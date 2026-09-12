pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven {
            name = "bugcord"
            url = uri("https://maven.aliucord.com/releases")
        }
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            name = "bugcord"
            url = uri("https://maven.aliucord.com/releases")
        }
    }
}

rootProject.name = "Bugcord-WebRTC"
