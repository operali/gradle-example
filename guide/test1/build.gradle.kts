// try > gradle tasks --all
// try > gradle -q hello // q stands for quiet (no log)
tasks.register("hello") {
    group = "custom group"
    description = "process a greeting"
    doLast {
        println("hello world")
    }
}