pluginManagement {
    includeBuild("build-logic")
}

//plugins {
//    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
//}

rootProject.name = "my-example-app"

include("app", "library")