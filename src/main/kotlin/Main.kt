fun main() {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    // println("Program arguments: ${args.joinToString()}")

    val someString: String = "Just a string"
    val count: Int = 2
    val someDouble: Double = 3.142
    // Decimal number (that is less precise than a Double). Has an f or F at the end of the number.
    val someFloat: Float = 3.142f
    val someBoolean: Boolean = true

    // instead if strings concatenation, using template
    println("$someString $count $someDouble $someFloat $someBoolean")
    println("You have $count unread messages.")

    /**
     * Math Operation and Type Inference.
     * Type inference is when the Kotlin compiler can infer (or determine) what data type a variable should be,
     * without the type being explicitly written in the code.
     */
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")

    /**
     * val keyword - Use when you expect the variable value will not change.
     * var keyword - Use when you expect the variable value can change.
     * In Kotlin, it's recommended to use the val keyword over the var keyword when possible.
     */

    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")
//    cartTotal = cartTotal + 1 or
    cartTotal++
    println("You have $cartTotal unread messages.")

    /**
     * Escape character
     */
    println("Say \"hello\"")

    arrayListVSMutableList()
    testFunction()

}

/**
 * By default, if you don't specify a return type, the default return type is Unit.
 * Unit means the function doesn't return a value. Unit is equivalent to void return types in other
 * languages (void in Java and C; Void/empty tuple () in Swift; None in Python, etc.).
 */
fun testFunction(): Unit {

    println("This is Unit function. or in java this is a void method ! ")

}

/**
 * https://www.baeldung.com/kotlin/arraylist-vs-mutablelistof
 *
 * Our first approach explicitly creates an instance of a particular class by calling its constructor — ArrayList<T>().
 *
 * In the second approach, we just want a mutable list and don’t really care about the implementation, and therefore,
 * we can’t make any assumptions about the actual implementation used under-the-hood.
 *
 * Other answer from stackoverflow:
 * https://stackoverflow.com/questions/43114367/difference-between-arrayliststring-and-mutablelistofstring-in-kotlin
 *
 * The only difference between the two is communicating your intent.
 * When you write val a = mutableListOf(), you're saying "I want a mutable list, and I don't particularly
 * care about the implementation". When you write, instead, val a = ArrayList(), you're saying
 * "I specifically want an ArrayList".
 *
 * In practice, in the current implementation of Kotlin compiling to the JVM, calling mutableListOf will produce
 * an ArrayList, and there's no difference in behaviour: once the list is built, everything will behave the same.
 *
 */
fun arrayListVSMutableList() {

    // This is Kotlin’s implementation of dynamic arrays.
    val arrayList = ArrayList<String>()
    arrayList.add("Kotlin")
    arrayList.add("Java")
    arrayList.add("ArrayList")
    println("arrayList => " + arrayList)

    val mutableList = mutableListOf<String>()
    mutableList.add("Kotlin")
    mutableList.add("Java")
    mutableList.add("MutableList")
    println("mutabaleList => " + mutableList)

}

