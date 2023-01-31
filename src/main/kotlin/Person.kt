class Person {

    var p:Int = 0
        get() = 999
        set(value){
            if(value>10) field = value
            else field = -1
        }
}