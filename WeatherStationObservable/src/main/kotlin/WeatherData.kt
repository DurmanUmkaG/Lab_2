import kotlin.properties.Delegates

class WeatherData {
    private fun <T> display(name: String, newValue: T) {
        println("$name: $newValue")
    }

    var temperature: Double by Delegates.observable(0.0) { prop, _, newValue ->
        display(prop.name, newValue)
    }

    var humidity: Double by Delegates.observable(0.0) { prop, _, newValue ->
        display(prop.name, newValue)
    }

    var pressure: Double by Delegates.observable(0.0) { prop, _, newValue ->
        display(prop.name, newValue)
    }

    var percentageOfOxygen: Double by Delegates.observable(0.0) { prop, _, newValue ->
        display(prop.name, newValue)
    }

    var rainfall: Double by Delegates.observable(0.0) { prop, _, newValue ->
        display(prop.name, newValue)
    }

    var presenceOfFog: Boolean by Delegates.observable(false) { prop, _, newValue ->
        display(prop.name, newValue)
    }
}