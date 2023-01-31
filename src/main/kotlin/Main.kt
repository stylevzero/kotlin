fun main(args: Array<String>) {

    /*

    V A R I A B L E S

     */

    println("Hola mundo!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")

    // Variables y constantes
    var numero:Int

    // Constante
    //val numero:Int = 0

    // Inferencia de tipo
    // var numero = 0

    //Variables nùmericas
    var numero2:Double = 2.99
    // var numero2 = 2.99

    var numero3:Float = 2.3f

    var entero:Int = 20
    var doble:Double = 30.88

    // Compatibilidad de tipos
    entero = doble.toInt()
    println(entero)

    //Variable boolean
    var alto = true
    var bajo = false

    // Variables char

    var letra:Char = 'G'

    // Variables del tipo String

    var cadena:String = "Hola mundo!"
    println(cadena.get(2)) // "l"

    // Variable de tipo array
    var array = arrayOf(1,2,3,4,5)
    var nombres = arrayOf("Lionel", "Juan", "Maria", "Lucia")
    println(array[0])
    array[0] = 100
    println(array[0])


    /*

    O P E R A D O R E S

    +,-,*,/   mod &

    A > B || A >= B
    A < B || B <= B

    A == B
    A != B (Distinto)

    */



    /*

     C O N D I C I O N A L E S

     */

    var x:Int = 20
    if(x > 18){
        println("Tienes más de 18")
    } else {
        println("Menos de 18")
    }

    // If como expresión
    var a:Int = 20
    var b:Int = 1
    val dato = if(a > b) a else b
    println(dato)

    var c:Int = 2
    if(c is Int) println("si") else println("no")

    // WHEN
    var d:Int = 2
    when(d){
        1 -> {
            println("1")
        }
        is Int ->{
            println("Es entero")
        }
        7,8,9 ->{
            println("valores 3")
        }
        else ->{
            println("No se encontró el valor")
        }
    }

    // If anidado

    var m:Int = 20
    var n:Int = 10
    if(m > 10){
        if(n > 0){
            println("If anidado")
        }
    }

    // WHEN

    var z:Int = 3
    when(z){
        1 -> {
            println("1")
            }
        2 -> {
            println("2")
            }
        3 -> {
            println("3")
            }
    else -> {
        println("No se encontró el valor")
        }
    }

    // Rangos y Agrupar Valores con When
    var y:Int = 2
    when(y){
        in 1..10 -> {
            println("Rango 1")
        }
        in 11..20 -> {
            println("Rango 2")
        }
        in 21..30 -> {
            println("Rango 3")
        }
        else -> {
            println("No se encontró el valor")
        }
    }

    var v:Int = 2
    when(v){
        1,2,3 ->{
            println("Valores 1")
        }
        4,5,6 ->{
            println("Valores 2")
        }
        7,8,9 -> {
            println("Valores 3")
        }
        else ->{
            println("No se encontró el valor")
        }
    }


    // Operador Is

    var k:Int = 2
    println(k is Int)

    if(k is Int){
        println("Es entero")
    } else {
        println("No es entero")
    }

    // For

    var items = listOf("uno", "dos", "tres", "cuatro")

    for(item in items){
        println(item)
    }

    for(l in 1..10){
        println(l)
    }

    // Step

    for(s in 1..10 step 2){
        println(s)
    }

    // DownTo
    for(f in 10 downTo 1){
        println(f)
    }


    // While
    var u:Int = 1
    while(u < 10){
        println(u)
        u++
    }

    // While
    var p:Int = 1
    do {
        println(p)
        p++
    } while (p<10)


    /*
    *
    * FUNCIONES
    *
    * */

    fun imprimir() {
        println("Imprimiendo...")
    }
    imprimir()

    fun imprimirTexto():String {
        return "Imprimiendo..."
    }

    fun print(h:String):String {
        return h
    }

    // Unit (void)

    // Indicmaos que no retorna nada
    fun reImprimir():Unit{
        println("Re imprimiendo")
    }

    fun reImprimir2(){
        println("Re imprimiendo 2")
    }

    // Funciones con parámetro por defecto

    fun sumar(num1:Int, num2:Int):Int {
        return num1 + num2
    }

    fun sumar2(num1:Int, num2:Int = 10):Int {
        return num1 + num2
    }

    // Funciones con parámetros con nombre

    fun imprimir3(dia:Int, mes:Int, año:Int){
    }
    imprimir3(dia=10, mes=10, año=22)


    // Funciones miembro

    var data:String = "hello World!"
    println(data.capitalize())

    // Atajo de teclado
    // CTRL + barra espaciadora -> lista de métodos


    // Funciones de Expresión Simple

    fun square(c:Int):Int{
        return c*c
    }

    fun square2(c:Int) = c*c

    // Varargs

    fun ejemplo(vararg palabras:String){
        for (palabra in palabras){
            println(palabra)
        }
    }
    ejemplo("Hello", "World", "Kotlin")

    // Funciones Genéricas

    fun generica(x:Int):Unit{
    }

    // Recibe cualquier tipo de dato
    // <T> indica tipo generico

    fun <T>generica2(t:T):Unit{
        println(t)
    }
    generica2(9)
    generica2("Hola")
    generica2(true)

    // Funciones de Extensión

    val texto = "ESto    es     una    cadena   con     espacios"
    fun String.quitarEsp():String{
        var regex = Regex("\\s+")
        return regex.replace(this, " ")
    }
    println(texto.quitarEsp())


     /*
     *
     * Programación orientada a objetos
     *
     * */

    // Clases

    /*
    val leonel = Persona("Leonel", 20)
    println(leonel.edad)
*/
    // Data Classes

    data class Persona(var nombre1:String, var edad1:Int)

    // Valores nulos

    var f1:String? = null
    var f2:String? = null

    if(f1 != null){

    }

    // Inicialización Tardía de Propiedades

    class ejemplo(var nombre:String, var edad:Int){
        lateinit var propiedad:MiPrimeraClaseKotlin

        inner class MiPrimeraClaseKotlin {

        }
    }

    // Inicialización Perezosa
    // Sólo se pueden aplicar a las propiedades que se definen como val
    val edad:Int by lazy { 9 }

    // Herencia

    /*
    * Kotlin no soporta la herencia múltiple
    * */
}