package Futures
import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import java.util.concurrent.TimeoutException

object BlockingException extends App {
  println("1 Empezamos")
    val f = Future {
        Thread.sleep(3000)
        5/0
    }
    println("2 Antes del Await")
    try {
      val result = Await.result(f, 1 second)
      println("3 Llegó = " + result)
    }
    catch {
      case e: TimeoutException => println("Tardó mucho: " + e);
      case e: Exception => println("Otra exception: " + e);
    }
    println("Antes del await con mas tiempo")
    try {
      val result = Await.result(f, 100 second)
      println("3 Llegó = " + result)
    }
    catch {
      case e: TimeoutException => println("Tardó mucho: " + e);
      case e: Exception => println("Otra exception: " + e);
    }
    println("4 fin del programa")
}