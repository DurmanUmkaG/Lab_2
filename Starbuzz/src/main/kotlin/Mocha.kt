class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun getFullDescription(): String {
        return if ("Mocha" in beverage?.getFullDescription().toString()) {
            beverage?.getFullDescription().toString().replace("Mocha", "Double Mocha")
        } else {
            beverage?.getFullDescription().toString() + ", Mocha"
        }
    } // = beverage?.getFullDescription().toString() + ", Mocha"

    override fun cost() = beverage?.cost()?.plus(.20) ?: 0.0
}