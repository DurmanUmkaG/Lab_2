fun main() {
    var beverage: Beverage = Espresso()
    println("${beverage.description} ${beverage.cost()}\$")
    println()

    var beverage2: Beverage = HouseBlend()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)

    println(beverage2.getFullDescription() + " $" + beverage2.cost())

    var beverage3: Beverage = ColdTea()
    beverage3 = Caramel(beverage3)
    beverage3 = Sale(beverage3, 20.0)
    println(beverage3.getFullDescription() + " $" + beverage3.cost())
}