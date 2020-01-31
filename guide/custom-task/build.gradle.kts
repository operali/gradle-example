// try > gradle tasks --all
// try > gradle -q hello // q stands for quiet (no log)

// https://guides.gradle.org/writing-gradle-tasks/

open class Greeting : DefaultTask() {
    lateinit var message:String
    lateinit var recipent:String

    @TaskAction
    fun greeting() = println("$message to $recipent")
}

tasks.register<Greeting>("hello") {
    group="test group"
    description="hello by class"
    message="hello"
    recipent="world"
}

