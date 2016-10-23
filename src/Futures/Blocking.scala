package Futures
import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object Blocking extends App {
  println("1 Empezamos")
    val f = Future {
        Thread.sleep(3000)
        5
    }
    println("2 Antes del Await")
    val result = Await.result(f, 10 second)
    println("3 Llegó = " + result)
    
    println("4 fin del programa")
}