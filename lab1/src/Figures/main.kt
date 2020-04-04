import Figures.*
import Utilities.*
import kotlin.math.min

fun main() {
    val Figures : Array<Any> = arrayOf(rectangulo(name = "Rectangulo", base = 20.0, altura = 15.0),
            triangulo(name = "Triangulo", base = 7.0), cuadrado(name = "Cuadrado", lado = 8.0),
            circulo(name = "Circulo", pi = rad))

    for (figura in Figures){
        println("La figura ${figura.name} tiene un area de ${figura.surface()} y un perimetro de ${figura.perimeter()}")
    }

    val tiempo1 = Tiempo(hora = "01", minuto = "05", segundo = "35")
    val tiempo2 = Tiempo(hora = "08", minuto = "18")
    val tiempo3 = Tiempo(minuto = "15")

    println("La hora en El Salvador es: ${tiempo1.hora} : ${tiempo1.minuto} : ${tiempo1.segundo}")
    println("La hora en Trinidad y tobago es ${tiempo1.cambiarHora(zona = "TT")}")
    println("La hora en España es ${tiempo1.cambiarHora(zona = "ES")}")
    println("La hora en Brasil es ${tiempo1.cambiarHora(zona = "BR")}")

    println(" ( ͡° ͜ʖ ͡°) ")

    println("La hora en El Salvador es: ${tiempo2.hora} : ${tiempo2.minuto} : ${tiempo2.segundo}")
    println("La hora en Trinidad y tobago es ${tiempo2.cambiarHora(zona = "TT")}")
    println("La hora en España es ${tiempo2.cambiarHora(zona = "ES")}")
    println("La hora en Brasil es ${tiempo2.cambiarHora(zona = "BR")}")

    println(" ( ͡° ͜ʖ ͡°) ")

    println("La hora en El Salvador es: ${tiempo3.hora} : ${tiempo3.minuto} : ${tiempo3.segundo}")
    println("La hora en Trinidad y tobago es ${tiempo3.cambiarHora(zona = "TT")}")
    println("La hora en España es ${tiempo3.cambiarHora(zona = "ES")}")
    println("La hora en Brasil es ${tiempo3.cambiarHora(zona = "BR")}")
}

abstract fun rectangulo(name: String, base: Double, altura: Double): Any
}
