/**
 * Created by andfaulkner on 2017-07-31.
 */
/************************************** VARIABLES **************************************/
fun variableTypes(): Unit {
    println("\n*** Define a mutable variable ***")
    var someVar = "ok"
    someVar = "okokok"
    println("Output defined mutable variable: " + someVar) // => "okokok"

    println("\n*** Define an immutablevariable ***")
    val someImmutableVar = 3
    // someImmutableVar = 10 // << triggers compile-time error
    // someImmutableVar++;   // << also triggers compile-time error
    println("Output defined immutable variable: " + someImmutableVar) // => "okokok"
}
