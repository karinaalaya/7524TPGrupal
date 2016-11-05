package highOrder

class Persona(val nombre: String, val apellido: String, val edadPersona : Int) extends Comparable[Persona]{
  
  val nombreCompleto = nombre + " " + apellido

  val edad = edadPersona
  
  def persentarse {
    println("Hola mi nombre es " + nombreCompleto) 
  }
  
  override def compareTo(that: Persona) = {
    this.edad compareTo that.edad
  }
  
}