/**
 * Created by andfaulkner on 2017-09-11.
 */
package canvas

fun operatorBasics(): Unit {
    println("Operators")
    // *= << same as +=, -=, but
    var age = 10
    age *= 3
    println("age: ${age}") // => should equal 30. Also, note the inline code.

    // == vs ===
    // ===: referential equality - check that the object references are the same
    var exampleClass = ExampleClass()
    var exampleClass2 = exampleClass

    println("exampleClass === exampleClass2: ${exampleClass === exampleClass2}") // => true
    println("\"a\" === \"a\": ${"a" === "a"}") // => true

    println("exampleClass == exampleClass2: ${exampleClass == exampleClass2}") // => true
    println("\"a\" == \"a\": ${"a" == "a"}") // => true

    println("arrayOf(\"a\", \"b\") == arrayOf(\"a\", \"b\"): ${arrayOf("a", "b") == arrayOf("a", "b")}")
    println("arrayOf(\"a\", \"b\") === arrayOf(\"a\", \"b\"): ${arrayOf("a", "b") === arrayOf("a", "b")}")

}

// There for use in example
class ExampleClass

