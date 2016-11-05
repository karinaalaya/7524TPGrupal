package traits

abstract class Ave {
    def mensajeAlVolar: String
    def volar() = println(mensajeAlVolar)
    def nadar() = println("Estoy nadando !")
}