package ScalaJVM

abstract class Variables {
  var Nombre = ""
  private var Edad = 0
  protected var AlgunaVariableString : String
  val SimpleAsignacion : String
  val SimpleAsignacionEntero: Int
  val(SimpleAsignacionEntero, SimpleAsignacion) = (40, "string")
}