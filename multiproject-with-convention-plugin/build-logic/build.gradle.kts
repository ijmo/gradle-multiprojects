plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

val versionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${versionCatalog.findVersion("kotlin").get()}")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:${versionCatalog.findVersion("springBoot").get()}")
}
