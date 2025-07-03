plugins {
    java
    alias(libs.plugins.quarkus.extension)
}

repositories {
    mavenCentral()
}

quarkusExtension {
    deploymentModule = "example-deployment"
}

group = "com.ryandens"

dependencies {
    implementation(platform(libs.quarkus.bom))
    implementation("io.quarkus:quarkus-undertow")
}