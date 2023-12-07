plugins {
    id("io.github.ijmo.kotlin-common-conventions")
    id("org.springframework.boot")
    application
}

val versionCatalog: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")
val springBootVersion = versionCatalog.findVersion("springBoot").get()
val springCloudVersion = versionCatalog.findVersion("springCloud").get()

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:$springBootVersion"))
    implementation(platform("org.springframework.cloud:spring-cloud-dependencies:$springCloudVersion"))

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.2.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.7.3")

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-webflux")

    testImplementation("io.projectreactor:reactor-test:3.6.0")
}