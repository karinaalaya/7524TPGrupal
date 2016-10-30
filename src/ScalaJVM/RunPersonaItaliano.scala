package ScalaJVM

import java.util.Date

object RunPersonaItaliano {
  def main(args: Array[String]) {
     var fechaJava = new Date
     var p = new PersonaNac("Pablo", fechaJava)
     p.Imprimir()    
  }
}