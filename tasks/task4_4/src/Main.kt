import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
  // iniial temperature, maximium temperature, temperature increment
   var initialTemperature = args[0].toFloat()

   while (initialTemperature < args[1].toFloat()) {
     val fahrenheitTemperature = (initialTemperature * 2) + 30
     println("%4.1f %4.1f".format(initialTemperature, fahrenheitTemperature))
     initialTemperature = initialTemperature + args[2].toFloat()
   }
}
