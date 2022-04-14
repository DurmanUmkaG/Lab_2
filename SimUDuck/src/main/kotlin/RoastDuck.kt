class RoastDuck : Duck() {
    init {
        quackBehavior = MuteQuack()
        flyBehavior = FlyNoWay()
        swimBehavior = SwimNoWay()
    }

    override fun display() {
        println("I'm a roast duck")
    }
}