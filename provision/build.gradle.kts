plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.sevtinge.provision"
    compileSdk = 35

    defaultConfig {
        minSdk = 34
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        create("beta") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        create("canary") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(22)
        }
    }
}

dependencies {
    api(libs.core)
    api(libs.recyclerview)
    api(libs.fragment)
    api(libs.coordinatorlayout)
    api(libs.constraintlayout) {
        exclude("androidx.appcompat", "appcompat")
    }

    api(
        fileTree(
            mapOf("dir" to "libs", "include" to listOf("*-debug.aar"))
        )
    )
}
