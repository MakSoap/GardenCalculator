import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.6.20"
}

group = "ru.maksoap"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    kotlin("jvm", "1.6.20")
    implementation("no.tornado:tornadofx:1.7.20")
}

application {
    mainClass.set("ru.maksoap.AppKt")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
    withType<Jar> {
        manifest {
            attributes["Main-Class"] = "ru.maksoap.AppKt"
        }
    }
}