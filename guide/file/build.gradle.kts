import java.io.File

// https://docs.gradle.org/current/userguide/working_with_files.html#working_with_files

tasks.register("main") {
    dependsOn("copy")
    dependsOn("zip")
    dependsOn("prepare dir")
}

tasks.register("prepare dir") {
    doLast {
        mkdir("dest")
    }
}

tasks.register<Copy>("copy") {
    from("$projectDir/src")
    into("$buildDir/dest")
}

tasks.register<Zip>("zip") {
    archiveFileName.set("src-zip.zip")
    destinationDirectory.set(file("$buildDir/zip"))

    from("$projectDir/src")
}

tasks.register("list") {
    doLast{
        File("$projectDir/src").walk().forEach {
            println(it.getName())
        }
    }
}