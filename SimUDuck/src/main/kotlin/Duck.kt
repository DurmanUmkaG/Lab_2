abstract class Duck {
    var flyBehavior: FlyBehavior? = null
    var quackBehavior: QuackBehavior? = null
    var swimBehavior: SwimBehavior? = null

    abstract fun display()

    fun performFly() {
        flyBehavior?.fly()
    }

    fun performQuack() {
        quackBehavior?.quack()
    }

    fun performSwim() {
        swimBehavior?.swim()
    }
}