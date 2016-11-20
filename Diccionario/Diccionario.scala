package Diccionario
import scala.collection.immutable.TreeMap

class Diccionario {
  private var _arbol = new TreeMap[Char, Int]()
  
  def Get(key:Char, default:Int):Int = {
    _arbol.getOrElse(key, default)
  }
  def Put(key: Char, valor: Int)={
    _arbol = _arbol.updated(key, valor)
  }
  def Domain():TreeMap[Int, TreeMap[Char, Int]] ={
    var ordenadoPorValor = new TreeMap[Int, TreeMap[Char, Int]]()
    var k = new TreeMap[Char, Int]
    var j = new TreeMap[Char, Int]
    _arbol.foreach(f => {
      k = ordenadoPorValor.getOrElse(f._2, new TreeMap[Char, Int])
      j = k.insert(f._1, f._2)
      ordenadoPorValor = ordenadoPorValor.updated(f._2, j)
    })
    return ordenadoPorValor
  }
}