package traits2

object TraitsExample2 extends App{
  
  val avesVoladoras = List(
    new Paloma,
    new Halcon,
    new Fragata)

  avesVoladoras.foreach(ave => ave.volar())
  
  println("")

  val avesNadadoras = List(
      new Paloma,
      new Halcon,
      new Pinguino)

  avesNadadoras.foreach(ave => ave.nadar())
  
}