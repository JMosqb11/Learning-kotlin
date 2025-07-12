fun main() {
    //varibles
    String
    Int
    Double
    Float
    Boolean

    //declaración de variables
    var v1 : String  = "Hello"
    println(v1)

    // o

    val v2 = 34

    // val constante, si el valor no cambia, deberia usar constante
    // var variable, siempre y cuando el valor de este puede cambiar

    // valores nulos
    var x : String? = null

    //Convertimos un dato de un tipo a otro dependiendo de como se vaya a usar solo agregandole un .to[tipo de dato]

    val num1 = 5 //este dato podemos cambiarlo a un string
    var num1.toString // con esto cambiamos el dato a un texto

    //Podemos hacer concatenacionesde la siguiente manera

    val t1 = "Hola"
    val t2 = "Solecito"
    var text1 = t1 + "" +t2

    // o

    println("Hola tengo $num1 y más años de edad");

    //Agregando un .plus(dentro de esto agregamos lo que queremos concatenar)

    val resultado = t1.plus(t2).plus(num1).plus(other = "")

    // o

    val res = arrayOf("arroz","sopa")
}

fun readConsole(){
    // con esto aprenderemos a escribir en console
    println("escribe tú nombre")
    val name = readln()
    println(name)
}

// Siempre pensar que el usuario va a hacer lo contrario, no usar la logica de nosotros como desarrolladores, sino trabajar y pensar que donde puede ir un texto el usuario agregara números o otros valores


// En esta clase veremos lo que es un bloque try catch

try{

} catch(){

}



