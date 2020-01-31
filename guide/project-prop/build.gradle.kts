

tasks.register("prop") {
    description="project-prop desc"    
    doLast {
        println("project:${project}")
        println("name:$name")
        println("path:$path")
        println("description:$description")
        println("projectDir:$projectDir")
        println("buildDir:$buildDir")
        println("projectDir:$projectDir")
        
    }
}
