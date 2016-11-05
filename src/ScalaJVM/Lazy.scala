package ScalaJVM

object Lazy extends App {
  def Hola() = {
    println("Hola!")
    10
  }
  lazy val a = Hola()
  // No imprime nada en este punto
  println(a + a)
  // No imprime nada en este punto

}