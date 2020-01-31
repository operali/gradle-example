
tasks.register<Copy>("main") {
    from("$projectDir/src")
    into("$buildDir/dest")
}