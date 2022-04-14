class Sale(beverage: Beverage, private val percent: Double) : CondimentDecorator(beverage) {
    override fun cost() = beverage?.cost()?.times((100 - percent) / 100) ?: 0.0

    override fun getFullDescription() = beverage?.getFullDescription().toString() + ", Sale!!!"
}