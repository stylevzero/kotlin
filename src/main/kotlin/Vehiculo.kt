import java.awt.Color

// open, la capaciddad de herencia en otras clases
open class Vehiculo (descripcion:String){
    var descripcion:String = ""
    var color:String = ""
    open val asientos:Int by lazy { 5 }

    init {
        this.descripcion = descripcion
    }

    constructor(descripcion:String, color:String, asientos:Int):this(descripcion){
        println("Constructor 2");
    }

    // open -> permiso de sobreescribir en alguna otra parte
    open fun arrancar(){
        println("Arrancando el vehiculo")
    }
}


// Modificadores de Visibilidad

/*
*
* Publico = acceder al elemento que lo tiene desde donde sea
* Interno = solo se puede acceder al elemento desde el modulo de codigo
* Protegido = implica solo se puede acceder a el desde la clase que lo define y las clases derivadas
* Privado = implica que solo se puede acceder desde la clase en donde esta definido
*
*
* public var x:Int = 1
* internal var y:Int = 2
* protected var z:Int = 3
* private var m:Int = 4
*
* */

// Clases Abstractas

/* Es una clase que tiene la capacidad de tener un método abstracto
Un método abstracto es un método que no tiene definido su comportamiento
 */

abstract class Suma {
    abstract fun sumar(x:Int, y:Int):Int
}

// Interfaces

/*
*
*
* */