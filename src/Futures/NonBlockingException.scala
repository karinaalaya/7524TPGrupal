package Futures
import scala.concurrent.{Future}
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import concurrent.Promise
import java.util.concurrent.TimeoutException

object NonBlockingException extends App {
    val promesa = Promise[Int]()
    val future = promesa.future
    val granCalculo = Future[Int] {
      Thread.sleep(3000)
      val r = scala.util.Random
      val numerador = r.nextInt(10)
      val denominador = r.nextInt(2)
      println("Numerador: " + numerador)
      println("Denominador: " + denominador)
      numerador / denominador   
    }
    granCalculo.onComplete {
      case Success(value) => {
          println("Division exitosa")
          promesa.success(value)
      }
      case Failure(e) => {
          println("Division fallida")
          promesa.success(0)
      }
    }
    
    future.onComplete {
      case Success(value) => 
          println("Resultado de la division: " + value)
      case Failure(e) =>
          println("falló")
    }    
    Thread.sleep(10000)
}