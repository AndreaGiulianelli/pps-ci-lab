plugins {
    java
    scala
    groovy
    kotlin("jvm") version "1.6.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.1.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
    implementation("org.codehaus.groovy:groovy:3.0.10")
    implementation(kotlin("stdlib"))
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
