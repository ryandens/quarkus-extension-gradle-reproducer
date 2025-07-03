plugins {
    `java-library`
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(platform(libs.quarkus.bom))
    implementation(project(":example"))
    implementation("io.quarkus:quarkus-undertow-deployment")
}