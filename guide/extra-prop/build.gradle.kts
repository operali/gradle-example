val prop = "prop field"
val prop1 by extra("prop1 field")
val prop2 by extra("prop1 field")


tasks.register("main") {
    println("prop:$prop")
    println("prop1:$prop1")
    // you cannot use extra["prop"]
    println("project.prop1:${project.extra["prop1"]}")
    println("prop2:$prop2")
}