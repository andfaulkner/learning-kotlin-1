/**
 * Created by andfaulkner on 2017-07-31.
 */
/************************************** CLASSES **************************************/
fun classes(): Unit {
    println("\n******************  CLASSES ******************")

    println("\n*** Instantiate class with constructor ***")
    var objFromClassWithCons = ClassWithConstructor()
    println(objFromClassWithCons)            // => [object Object]
    println(objFromClassWithCons.toString()) // => [object Object]

    val objExample = AnotherClassExample("Meeka Faulkner")
    println(objExample)
}

/****** DEFINE AN EMPTY CLASS ******/
/**
 * An empty class.
 */
class Empty

/****** DEFINE CLASS WITH CONSTRUCTOR ******/
class ClassWithConstructor {
    constructor() {
        println("Built ClassWithConstructor")
    }
}

/****** DEFINE CLASS WITH PROPERTIES ******/
class ClassWithProps {
    var name: String = ""
    constructor(newName: String) {
        name = newName
    }
}

/****** DEFINE CLASS WITH FUNCTIONS******/
class ClassWithFunctions {
    var firstName: String = ""
    var lastName: String = ""
    constructor(firstName: String, lastName: String)

    fun fullName(): String {
        return firstName + lastName
    }
}

class AnotherClassExample {
    var testName: String = ""

    constructor(testName: String) {
        this.testName = testName
    }
}
