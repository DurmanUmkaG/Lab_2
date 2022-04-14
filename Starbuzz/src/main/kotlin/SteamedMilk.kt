class SteamedMilk(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun cost() = beverage?.cost()?.plus(.10) ?: 0.0

    override fun getFullDescription() = beverage?.getFullDescription().toString() + ", Steamed Milk"
}