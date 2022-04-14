class WeatherData : Subject {
    private val observers: ArrayList<Observer> = ArrayList()
    private var temperature = 0f
    private var humidity = 0f
    private var pressure = 0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.forEach { it.update(temperature, humidity, pressure) }
    }

    private fun measurementChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementChanged()
    }

}