plugins {
    id("java")
}

group = "dev.mcishv.saveitems"
version = "1.0-RELEASE"

repositories {
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20-R0.1-SNAPSHOT")
    compileOnly("com.google.guava:guava:32.0.1-android")
}