class WoodenDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = MuteQuack()
        swimBehavior = SwimNoWay()
    }

    override fun display() {
        println("I'm a wooden duck")
    }
}