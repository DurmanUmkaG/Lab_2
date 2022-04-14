abstract class Beverage {
    var description = "Unknown beverage"

    open fun getFullDescription() = description
    abstract fun cost(): Double
}