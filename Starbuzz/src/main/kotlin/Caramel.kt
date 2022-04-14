class Caramel(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun cost() = beverage?.cost()?.plus(.18) ?: 0.0

    override fun getFullDescription() = beverage?.getFullDescription().toString() + ", Caramel"


}