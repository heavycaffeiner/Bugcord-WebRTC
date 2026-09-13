plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin)
    id("maven-publish")
}

android {
    namespace = "org.webrtc"
    compileSdk = 36

    defaultConfig {
        minSdk = 24
        consumerProguardFiles("consumer-rules.pro")
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

dependencies {
    compileOnly(libs.annotation)
    compileOnly(libs.discord)
    compileOnly(libs.kotlin.stdlib)
}

kotlin {
    jvmToolchain(21)

    compilerOptions {
        freeCompilerArgs.addAll(
            "-Xno-call-assertions",
            "-Xno-param-assertions",
            "-Xno-receiver-assertions",
        )
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                groupId = "com.bugcord"
                artifactId = "Bugcordwebrtc"
                version = "1.0.2"

                from(components["release"])
            }
        }
    }
}
