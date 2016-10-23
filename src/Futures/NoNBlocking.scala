package Futures
import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object NonBlocking extends App{
    println("1 Empezamos")
    val f = Future {
        Thread.sleep(3000)
        "Algún resultado"
    }
    println("2 Antes del onComplete")
    f.onComplete {
      case Success(value) => println(s"Llegó = $value")
      case Failure(e) => e.printStackTrace
    }
    println("3 Despues del onComplete")
    
    Thread.sleep(10000)
    println("4 fin del programa")
}