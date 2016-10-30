package PatternMatching

object CaseClasses extends App {
  case class Persona(nombre: String, edad: Int)
  def ejemplo {
      val p1 = new Persona("José", 25)
      val p2 = new Persona("Pepe", 32)
      val p3 = new Persona("Amelia", 32)
   
      for (person <- List(p1, p2, p3)) {
         person match {
            case Persona("José", 25) => println("Hola José!")
            case Persona(nombre, edad) => println(
               "Edad: " + edad + ", Nombre: " + nombre)
         }
      }
   }
  ejemplo
}