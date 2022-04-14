class MallardDuck : Duck() {
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
        swimBehavior = SwimWithPaws()
    }

    override fun display() {
        println("I'm a real Mallard duck")
    }
}