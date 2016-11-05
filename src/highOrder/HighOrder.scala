package highOrder

object HighOrder extends App{
  
  val personaGrande = new Persona("Rafeal", "Grande",25)
  val personaMenor = new Persona("Jorge", "Menor",16)
 
  val personas = List(personaGrande,personaMenor)
  
  println("Total de personas: " + personas.size)
  
  val (menores, adultos) = personas partition (_.edad < 18)
  
  println("Cantidad de personas mayores: " + menores.size)
  println("Cantidad de personas menores: " + adultos.size)

  
  val iterator = menores.iterator
  while (iterator.hasNext){
    println(iterator.next().nombreCompleto)
  }
  
  for (adulto <- adultos){
    println(adulto persentarse)
  }
  
}