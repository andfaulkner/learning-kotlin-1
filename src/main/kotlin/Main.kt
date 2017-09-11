/**
 * Created by andfaulkner on 2017-07-31.
 */
external fun require(module:String):dynamic

/****************************************** ENTRY POINT *******************************************/
// All projects are run by executing the main function.
fun main(args: Array<String>) {
    // Log something to the console:
    println("Hello JavaScript!")



    // TOPIC: Kotlin variables / variable types
    variableTypes()

    // TOPIC: Kotlin functions
    // Run function requiring no variables
    // This is loaded *automatically* from in-scope Kotlin file
    runningFunctions();

    // TOPIC: Kotlin lists
    lists()

    // TOPIC: Kotlin classes.
    classes()

    // *** You can load and access JS modules using require ***
    val express = require("express")

    // *** Run functions from a loaded JS module ***
    // Create an Express server.
    //    val app = express()
    //
    //    // *** Pass Express server a lambda to handle a route ***
    //    app.get("/", { req, res ->
    //        res.type("text/plain")
    //        res.send("i am a beautiful butterfly")
    //    })
    //
    //    // Launch Express server.
    //    app.listen(3000, {
    //        println("Listening on port 3000")
    //    })
}
