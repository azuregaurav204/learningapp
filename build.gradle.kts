plugins {
	java
	id("org.springframework.boot") version "3.2.5"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.gaurav.azure"
version = "1.0"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks {
	withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
		enabled = true
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
