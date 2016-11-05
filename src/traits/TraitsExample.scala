package traits

object TraitsExample extends App{
  
  val aves = List(new Paloma,new Halcon)

  aves.foreach(ave => ave.volar())
  
}