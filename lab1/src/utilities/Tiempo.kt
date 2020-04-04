package Utilities
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
const val TrinindadYTobago: String="TT"
const val España: String="ES"
const val Brasil: String="BR"

class Tiempo(var hora: String="00",var minuto: String="00", var segundo: String="00"){

    fun cambiarHora(zona:String):String {
        val diferencia:Int
        when(zona){
            Brasil->diferencia=3
            España->diferencia=7
            TrinindadYTobago->diferencia=2

            else->diferencia=0
        }
        val formato = SimpleDateFormat("HH:mm:ss")
        val parsed: Date =formato.parse("${hora}:${minuto}:${segundo}")
        val cal=Calendar.getInstance()
        cal.setTime(parsed)
        cal.add(Calendar.HOUR_OF_DAY, diferencia)
        val dateFormat: DateFormat = SimpleDateFormat("HH:mm:ss")
        return dateFormat.format(cal.time)
    }
}