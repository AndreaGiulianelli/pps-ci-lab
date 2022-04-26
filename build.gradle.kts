plugins {
    java
    scala
    jacoco
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

tasks.test {
    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
}

tasks.jacocoTestReport {
    dependsOn(tasks.test) // tests are required to run before generating the report
    reports {
        csv.required.set(true)
        xml.required.set(true)
    }
}
