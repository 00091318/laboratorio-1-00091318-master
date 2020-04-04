package Figures

class triangulo(val base: Double, val altura: Int, val a: Float, val b: Float, val c: Float) {
    var name: String = "triangulo"
    fun surface(): Int{
        return(base * altura)/2
    }
    fun perimeter(): Float {
        return a + b + c
    }
}