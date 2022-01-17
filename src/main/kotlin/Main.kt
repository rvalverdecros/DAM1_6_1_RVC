abstract class Vehiculo(open val nombre:String, open val color: String, open val peso: Double){

abstract fun arrancar()
abstract fun parar()
fun mostrar(){
    println("Nombre: $nombre, Color: $color")
}
}

class Coche(override val nombre:String, override val color: String, override val peso: Double):Vehiculo(nombre, color, peso){
    override fun arrancar() {
        println("Coche arrancado")
    }
    override fun parar() {
        println("Coche parado")
    }

}

class Moto(override val nombre:String, override val color: String, override val peso: Double):Vehiculo(nombre, color, peso){
    override fun arrancar() {
        println("Moto arrancado")
    }
    override fun parar() {
        println("Moto parado")
    }

}

abstract class Animal(open val tipo:String){

    abstract fun accion()
}

class Perro(override val tipo:String):Animal(tipo) {
    override fun accion() {
        println("Esta durmiendo")
    }
    fun ladra(){
        println("El perro esta ladrando!!!")
    }
}

class Gato(override val tipo:String):Animal(tipo) {
    override fun accion() {
        println("El gato esta encima de la mesa")
    }
    fun maulla(){
        println("El gato esta maullando!!!")
    }
}

fun main() {

val uno = Coche("toyota","rojo",23.4)
val dos = Moto("hyundai","azul",12.3)
val tres = Perro("Dalmata")
val cuatro = Gato ("Gato Montes")
uno.arrancar()
uno.mostrar()
dos.parar()
tres.accion()
cuatro.maulla()
}
