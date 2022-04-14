class Soy(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getFullDescription() = beverage?.getFullDescription().toString() + ", Soy"

    override fun cost() = beverage?.cost()?.plus(.15) ?: 0.0
}