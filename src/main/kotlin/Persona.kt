
// Constructor
class Persona constructor(nombre:String, edad:Int) {
    var nombre:String = ""
    var edad:Int = 0

    // Init
    init{
        this.nombre = nombre
        this.edad = edad
    }

    // Constructores secundarios
    /*
    constructor(nombre:String, edad:Int):this(nombre){
        println("Constrcutor 2")
    }
*/
    constructor(nombre:String, edad:Int, x:Int):this(nombre,edad){
        println("Constructor 3")
    }

    // Métodos
    fun saludar(nombre:String){
        println("Hola, buenos días" + nombre)
    }
    fun cambiarNombre(newNombre:String){
        this.nombre = newNombre
    }

    // Clases Anidadas
    class Claseb {

    }

    // Clases Inner
    /* Clase interna, se declara como un miembro est{atico de otra clase */

    inner class claseC {

    }

    // Propiedades var o val

    class Ejemplo{
        var x:Int = 0
        val y:Int = 0
    }
    //objeto.x = 10

}