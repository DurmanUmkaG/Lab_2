class ModelDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
        swimBehavior = SwimNoWay()
    }

    override fun display() {
        println("I'm a model duck")
    }
}