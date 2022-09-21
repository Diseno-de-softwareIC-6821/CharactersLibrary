//constant: can't change in the future
const a: number = 1;

//variable: can change in the future
let b: any = 2;

// How to declare a function
function add(a: number, b: any) {
    return a + b;
}
// How to declare a function with types
function add2(a: number, b: number): number {
    return a + b;
}

// How to declare a function with types and default value
function add3(a: number, b: number = 2): number {
    return a + b;
}

// How to declare an interface
interface PersonInterface {
    name: string;
    age: number;
    greet(): string;
}

// How to declare a class
class Person implements PersonInterface {

    name: string;
    age: number;
    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }

    // How to declare a method
    greet() {
        return `Hello, my name is ${this.name} and I am ${this.age} years old`;
    }
}

// How to declare an object
const person: Person = new Person("John", 30);

// How to declare an array
const numbers: number[] = [1, 2, 3, 4, 5];

// How to declare a tuple
const tuple: [string, number] = ["John", 30];

// How to loop through an array
for (let i = 0; i < numbers.length; i++) {
    console.log(numbers[i]);
}

// How to loop through an array with for...of
for (let number of numbers) {
    console.log(number);
}

// use map to loop through an array
numbers.map((number) => {
    console.log(number);
});

const enteros: number[] = [1,2,3,4,5,6,7,8,9,10];


// for with length
for (let i = 0; i < enteros.length; i++) {
  console.log(enteros[i]);
}

//forEach 
enteros.forEach((element) => {
  console.log(element);
});


//map
const enterosDobles = enteros.map((element) => {
  return element * 2;
});

// For of
for(let x of enteros){
  console.log(x);
  x = 0
}

console.log(enteros);


// para cuando la llamada puede estar en cualquier lugar del codigo
function nombre(): void{
    console.log("Hola");
}

// para llamadas dentro de otras funciones
(param1: any, param2: any): number => {
    return param1 + param2;
}

// para cuando la llamada esta OBLIGATORIAMETE despues de la declaracion
const varFunc = (param1: any, param2: any): number => {
    return param1 + param2;
}

