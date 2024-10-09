plugins {
    kotlin("jvm") version "1.9.24" // JVM에서 코틀린을 사용하기 위한 기본 플러그인
    id("java") // JVM 자바를 사용하기 위한 기본 플러그인
}

kotlin {
    /**
     *  코틀린을 컴파일 할 때, JDK21 버전의 바이트 코드로 컴파일하도록 해줌.
     *  실행될 JVM 버전을 명시적으로 지정해준다.
     */
    jvmToolchain(21)
}

group = "yjh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testImplementation("org.assertj:assertj-core:3.26.3")
}

tasks.test {
    useJUnitPlatform()
}