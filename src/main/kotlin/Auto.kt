// La clase auto : hereda de vehiculo
class Auto:Vehiculo, acciones {
    override val asientos:Int = 4
    constructor(descripcion:String, color:String, asientos:Int):super(descripcion, color, asientos)

    // Sobreescribiendo el método
    override fun arrancar(){
        println("Arrancando")
    }

    override fun mover() {
        TODO("Not yet implemented")
    }

    override fun estacionar() {
        TODO("Not yet implemented")
    }
}