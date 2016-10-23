import java.util.{Date, Locale}
import java.text.DateFormat._

class PersonaNac(val nombre: String, val fecha: Date) {
    def Nombre() = nombre
    def FechaNacimiento() = fecha
    def Imprimir(){
      val df = getDateInstance(LONG, Locale.ITALIAN)
      println(df format fecha)
    }
}