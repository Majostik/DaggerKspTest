plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.testkspproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.testkspproject"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.hilt)

    implementation(projects.core)
    implementation(projects.feature.feature1)
    implementation(projects.feature.feature2)
    implementation(projects.feature.feature3)
    implementation(projects.feature.feature4)
    implementation(projects.feature.feature5)
    implementation(projects.feature.feature6)
    implementation(projects.feature.feature7)
    implementation(projects.feature.feature8)
    implementation(projects.feature.feature9)
    implementation(projects.feature.feature10)
    implementation(projects.feature.feature11)
    implementation(projects.feature.feature12)
    implementation(projects.feature.feature13)
    implementation(projects.feature.feature14)
    implementation(projects.feature.feature15)
    implementation(projects.feature.feature16)
    implementation(projects.feature.feature17)
    implementation(projects.feature.feature18)
    implementation(projects.feature.feature19)
    implementation(projects.feature.feature20)
    implementation(projects.feature.feature21)
    implementation(projects.feature.feature22)
    implementation(projects.feature.feature23)
    implementation(projects.feature.feature24)
    implementation(projects.feature.feature25)
    implementation(projects.feature.feature26)
    implementation(projects.feature.feature27)
    implementation(projects.feature.feature28)
    implementation(projects.feature.feature29)
    implementation(projects.feature.feature30)
    implementation(projects.feature.feature31)
    implementation(projects.feature.feature32)
    implementation(projects.feature.feature33)
    implementation(projects.feature.feature34)
    implementation(projects.feature.feature35)
    implementation(projects.feature.feature36)
    implementation(projects.feature.feature37)
    implementation(projects.feature.feature38)
    implementation(projects.feature.feature39)
    implementation(projects.feature.feature40)
    implementation(projects.feature.feature41)
    implementation(projects.feature.feature42)
    implementation(projects.feature.feature43)
    implementation(projects.feature.feature44)
    implementation(projects.feature.feature45)
    implementation(projects.feature.feature46)
    implementation(projects.feature.feature47)
    implementation(projects.feature.feature48)
    implementation(projects.feature.feature49)
    implementation(projects.feature.feature50)

    ksp(libs.hiltCompiler)
}