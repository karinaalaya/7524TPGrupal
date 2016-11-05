package ScalaJVM

object Lazy extends App {
  
  def Hola() = {
    println("Hola!")
    10
  }
  
  println("Antes de llamar a Lazy !")
  println("")
  
  lazy val a = Hola()
  
  println("Después de llamar a Lazy !")
  println("")

  println(a + a)

}