

package ScalaJVM

class PersonaBase(val nombre: String, val edad: Int) {
  def Nombre() = nombre
  def Edad() = edad
  def Imprimir(){
     println("Nombre: " + nombre)
     println("Edad: " + edad)
  }
}