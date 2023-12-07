plugins {
    id("io.github.ijmo.kotlin-application-conventions")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    testImplementation("io.projectreactor:reactor-test")

    implementation(project(":library"))
}