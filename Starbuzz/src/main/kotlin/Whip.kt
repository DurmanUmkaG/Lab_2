class Whip(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun getFullDescription() = beverage?.getFullDescription().toString()

    override fun cost() = beverage?.cost()?.plus(.10) ?: 0.0
}