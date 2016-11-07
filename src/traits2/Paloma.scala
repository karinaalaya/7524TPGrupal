package traits2

class Paloma extends Ave with Nado with Vuelo{
    val mensajeAlVolar = "Soy una buena voladora"
    override def nadar() = println("Soy una Paloma y nado medio mal, pero nado.")
}
