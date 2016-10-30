package PatternMatching

object CaseClasses2 extends App {

  abstract class Arbol
  case class Rama(derecha: Arbol, izquierda: Arbol) extends Arbol
  case class Hoja(x: Int) extends Arbol

  val arbol1 = Rama(Rama(Hoja(1), Hoja(2)), Rama(Hoja(3), Hoja(4)))

  // sumar todos los valores del arbol
  def SumarHojas(t: Arbol): Int = t match {
    case Rama(i, d) => SumarHojas(i) + SumarHojas(d)
    case Hoja(x) => x
  }
  println("Total:  " + SumarHojas(arbol1))
}