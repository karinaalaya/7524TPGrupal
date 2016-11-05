package ScalaJVM

object Clausura extends App {
  def fun1():Int => Int = {
   val y = 1
   def Sumar(x: Int) = x + y
   Sumar
  }
  def fun2() = {
     val y = 2
     val z = fun1()
     println(z(2)) // imprime 3 o 4?
  }
  fun2()

}