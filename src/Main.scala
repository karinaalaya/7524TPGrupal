import java.util.Date

object Main {
  def main(args: Array[String]) {
     var fechaJava = new Date
     var p = new PersonaNac("Pablo", fechaJava)
     p.Imprimir()
     
    /*val p1 = new Persona("José Perez", 30)
    val p2 = new Persona("Maria Hernandez", 10)
    val p3 = new Persona("Ana Gonzalez", 40)
    val personas = scala.List(p1, p2, p3)
    
    val personasOrdenadas = personas.sortWith(_.nombre < _.nombre)
    personasOrdenadas.foreach { p => p.Imprimir() }*/
    
   /* // java conversion iterator
    // val it : java.util.Iterator[Persona] = personas.iterator
    // java conversion collection
    val javaList : java.util.ArrayList[Persona] = personas
    javaList.so*/
    
  }
}