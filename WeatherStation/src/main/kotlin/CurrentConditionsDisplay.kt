class CurrentConditionsDisplay : Observer, DisplayElement {
    private var temperature = 0f
    private var humidity = 0f
    private val weatherData: Subject

    constructor(weatherData: Subject) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions $temperature F degrees and $humidity % humidity")
    }
}