/**
 * Created by andfaulkner on 2017-07-31.
 */
/************************** LISTS**************************/
fun lists(): Unit {
    println("\n****** Declare a list of type Int ******")
    val list1 =  arrayListOf<Int>(0, 1, 2)

    println("\n****** Declare an untyped list ******")
    val list2 = arrayOf("Mon", "Tue", "Wed", "Thur", "Fri", "Sat");

    println("\n****** Get list size ******")
    val list1Size = list1.size
    println(list1Size) // => 3

    // SUBTOPIC: Ranges
    println(ranges(0, 5)) // => [0, 1, 2, 3, 4, 5]s
}


/************************** RANGES **************************/
/**
 * Create an integer range
 * @param {Int} start Integer to start the range at.
 * @param {Int} end   Integer to end the range at.
 * @return {List<Int>} containing all integers from start to end value
 */
fun ranges(start: Int, end: Int): List<Int> {
    println("\n*** Define a range between 2 given integers ***")
    println(1..6) // => 1..6

    println("\n*** Define a range between given start and end value ***")
    val range: IntRange = start..end
    return range.distinct()
}