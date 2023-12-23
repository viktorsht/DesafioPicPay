plugins {
    id("java")
}

group = "br.com.bank"

repositories {
    mavenCentral()
}

dependencies {
    implementation (project(":core"))
    implementation (project(":usecase"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}