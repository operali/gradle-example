

tasks.register("main") {
    description="project-prop desc"    
    doLast {
        println("project:${project}")
        println("name:$name")
        println("path:$path")
        println("description:$description")
        println("projectDir:$projectDir")
        println("buildDir:$buildDir")
        // project is the top env/receiver?, you can skip it
        println("projectDir:${project.projectDir}")
        println("rootDir:$rootDir")
    }
}
