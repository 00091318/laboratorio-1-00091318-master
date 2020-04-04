package Figures

class cuadrado(val lado: Double) : Figures  {
    val nombre: String = "cuadrado"
    fun calcularArea(): Int {
        val lado : Int = 0
        return lado * lado
    }
     fun calcularPerimetro(): Int {
        return lado * 4
    }
}
