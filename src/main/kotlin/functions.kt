/**
 * Created by andfaulkner on 2017-07-31.
 */

//
/******************************************* FUNCTIONS ********************************************/
//

// Below function runs other functions in this experiment
/**
 * @function runningFunctions
 */
fun runningFunctions() {
    println("\n**** Run function requiring no variables ****")
    hello(); // => "Hello!"

    println("\n**** Run another function, containing 1 variable ****")
    helloName("Boaty McBoatface") // => "Hello Boaty McBoatface!"

    println("\n**** Run function with optional argument, using no values ****")
    helloNameMaybe() // => Hello!

    println("\n**** Run function with optional argument, using 1 value ****")
    helloNameMaybe("GrArgh") // => Hello GrArgh!

    println("\n**** Run function with nullable argument using null ****")
    helloNameMaybe(null) // => Hello!

    println("\n**** Run function with return type 'String' and display returned string ****")
    println(buildHello())
}

/********* DECLARING FUNCTIONS *********/
// ***** Create new function with no variables *****
/**
 * @function hello
 */
fun hello() {
    /**** Log values with println ****/
    println("Hello!")
}

// ***** Create new function with 1 variable *****
/**
 * @function hello
 * Says hello
 * @param {String} name Name of person.
 */
fun helloName(name: String) {
    println("Hello $name!")
}

// ***** Create new function with optional variable *****
/**
 * @function hello
 * Says hello
 * @param {String} name Name of person. Default value: null
 */
fun helloNameMaybe(name: String? = null): Unit {
    if (name != null)
        helloName(name)
    else
        hello()
}

// ***** Create new function that returns a value *****
// You *MUST* declare the return type. See below.
/**
 * @function buildHello
 * @param {String} name Name of person. Default value: null
 */
fun buildHello(name: String? = null): String {
    if (name != null)
        return "Hello $name!"
    else
        return "Hello!"
}


/********* NULLABLE ARGUMENTS *********/
// The ? in name: String? argabove means the function can accept null in the first parameter. E.g.:
//      fun helloNameMaybe(name: String? = null): Unit {
//          ...
//      }
