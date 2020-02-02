package sample

expect fun platformName(): String // ← Expecting this to be implemented

//Usage
fun createApplicationScreenMessage(): String {
    return "Hello from ${platformName()}"
}