package Figures

class rentangulo(val base: Int, val altura: Int) : Figures  {
  val nombre: String = "Rentángulo"

     fun calcularArea(): Int {
        return base * altura
    }

    fun calcularPerimetro(): Int {
        return (base * 2) + (altura * 2)
    }
}