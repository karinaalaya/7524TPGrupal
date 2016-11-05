package traits2

object TraitExample3 extends App{
  
    val avesVoladoras = List(
    new Paloma,
    new Halcon,
    new Fragata)

  avesVoladoras.foreach(ave => ave.volar())
  
  println("")
  println("****************************")
  println("Creando Fragata MUTANTE")
  println("****************************")
  println("")
  
  
  val fregataMutante = new Fragata with Nado

  val avesNadadoras = List(
      new Paloma,
      new Halcon,
      new Pinguino,
      fregataMutante)

  avesNadadoras.foreach(ave => ave.nadar())
}