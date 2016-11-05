package traits2

trait Vuelo {
    def volar() = println(mensajeAlVolar)
    def mensajeAlVolar: String
}