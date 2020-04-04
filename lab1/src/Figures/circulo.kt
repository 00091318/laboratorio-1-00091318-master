package Figures
import kotlin.math.*

class Circulo (
        override var name : String = "",
        var radio : Double = 0.0
) : Figure {
    override fun perimeter(): Double {
        return 2*PI*radio
    }

    override fun surface(): Double {
        return PI*radio.pow(2.0)
    }

}