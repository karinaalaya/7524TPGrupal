package Diccionario
import scala.collection.immutable.TreeMap

object Main extends App{
  // sumar todos los valores del arbol
  def ImprimirHojas(t: TreeMap[Int, TreeMap[Char, Int]]): Unit = { 
    t.foreach(f => {
        println("Frecuencia: " + f._1)
        f._2.foreach(g => println("   - Letra: " + g._1))
      })
  }
  // lista default
  val lista = List('b', 'b', 'm', 'm', 'm', 'a', 'a', 'c', 'a', 'c', 'p', 'p', 'l', 'l', 'l', 'x', 'a', 'j', 'j', 'j', 'j', 'p', 't', 'r', 'r', 'n', 'n', 'n', 'n', 'n', 'h')
  // inicializo el diccionario
  var D = new Diccionario()
  // lleno el diccionario con la lista
  lista.foreach{ x => { 
      var valor = D.Get(x, 0)
      valor = valor + 1
      D.Put(x, valor)}}
	val A = D.Domain()
	ImprimirHojas(A)
}