package ScalaJVM

class Persona(val nombre: String, val edad: Int) extends Comparable[Persona]{
    def Nombre() = nombre
    def Edad() = edad
    def Imprimir(){
       println("Nombre: " + nombre)
       println("Edad: " + edad)
    }
    override def compareTo(that: Persona) = {
        this.edad compareTo that.edad
    }
}