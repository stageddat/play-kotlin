#!/usr/bin/env kotlin

// Variables
var porros = 5; // var = variables mutables
val octopus = 7;   // val = variables read-only

porros= 8;
println(porros);
println("Me he fumado ${porros} porros!");
println("Me voy a fumar un porrito más :D! Ya he fumado ${porros + 1} porros!");
println();

// Funciones
fun main() {
    println("Hello, world!");
    // Hello, world!
}

main();

// tipos basicos e inferencia de tipos
// operaciones basicas: +=, -=, *=, /=, and %=
val entero: Int = 10                     // Int
val texto: String = "me pica el culo"    // String
val decimal: Double = 3.14               // Double
val numeroGrande: Long = 100_000_000L    // Long
val booleano: Boolean = false            // Boolean
val caracter: Char = '\n'                // Char

// se requiere declarar el valor si inicias una variable
var tetas: Int
tetas = 3