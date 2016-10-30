package PatternMatching

object Basic extends App {
   def proceso(comando: Any): String = comando match {
      case "-a" | "-ayuda" => "Ya te ayudo"
      case "-p" | "-proceso" => "Procesando..."
      case _:Int => "Un entero"
      case x => "Comando inválido: '" + x + "'"
    }
    println(proceso("-a"))
    println(proceso("-proceso"))
    println(proceso(2))
    println(proceso(2.5))
}