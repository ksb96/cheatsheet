//If-Else
int a = 10;
int b = 50;
if( a < b){
	System.out.println("b is greater than a");
} else {
	System.out.println("a is greater than b");//(a > b)
}

//Switch case
 int c = 3;
 switch(c)
 {
 	case 1: System.out.println("not you i m looking for");
 			break;
 	case 2: System.out.println("no not you dear!");
 			break;
 	case 3: System.out.println("yes, finally found you");
 			break;
 	default: System.out.println("Sorry could'nt be found");
 				break;
 }

//For-loop
int sum = 0; 
for(int i = 0; i <= 5; i++){
	sum = sum + i;
	System.out.println("the sum is -", s);
 }

//while-loop
int c = 0;
while(c<5){
	System.out.println("hello");
	c++;
}

//do-while
int r = 0;
do{
	System.out.print("hi");
	r++;
}while(r<=5);
/*
0-->hi(1)
1-->hi(2)
2-->hi(3)
3-->hi(4)
4-->hi(5)
5-->hi(6)
*/

//break
int s =0;
while(s<10){
	if(s == 5)
		break;
	s++;
	}
	System.out.println(s);

//continue(skip)
for(int i = 0; i<=10; i++){
	if(i == 5){
		continue;
		i++;
	}
	System.out.println(i);
}
/*
1
2
3
4
6
7
8
9
10
*/


//boolean 
String s = "neel";
if(s != "neel"){
	System.out.println("sorry to bother you");
}
else
{
	System.out.println("hi dude");//true
}


//array
int ar[] = new int[10];//10 spaces are created in memory for storing values
int ar[] = {"1","2","3"};//numbers are treated as string
int ar[] = [1,2,3];//numbers are stored

public class ar
{
	public static void main(String args[]){
		int ar [] = [12,25,254,222,5];
		int l = ar.length();
	System.out.print(l);
} 
 }

//assign value
 int ar[]=new int[4];
  ar[0] = 800;
  ar[1] = 900;
  ar[2] = 1000;
  ar[3] = 100;
 int value = ar[0];
 int value1 = ar[1];
 int value2 = ar[2];
 int value3 = ar[3];
System.out.println(value);//ar[0]
System.out.println(value1);//ar[1]
System.out.println(value2);//ar[2]
System.out.println(value3);//ar[3]

//Arrays.sort()
import java.util.Arrays;
....
....
....
int ar[] = {"cat","apple","hippo","baby"};
for(int i = 0; i<4; i++)//i=o;i<ar.length;i++
Arrays.sort(ar);//sort the given array in ascending order
System.out.println(ar[i]+"");//array[index]--gona iterate 

//Math
round()//if the number is > 0.5 = nearest greater number, if number is < 0.5 = nearest lower number
ceil()//nearest to largest whole number
floor()//nearest to lowest whole number
abs()//returns the integer part.
log()
max()
min()
random()//range from 0.0 to 1.0
pow(2,3)// 2 to-the-power '3' = 2*2*2=8
sqrt(number)
PI


//String
string.length();//syntax to find the length of a string--varName.length();
String str = "hello myself kubstar";
int l = str.length();
System.out.println(l);

//concat --> add/join
String str1 = 'hey there!';
String str2 = 'how you have been ?';
System.out.println(str1.concat(str2));//System.out.println(str1 + str2);

//equals
String str1 = 'Good';
String str2 = 'good';
System.out.println(str1.equals(str2));//false coz 'upperCase' 'lowerCase'

//charAt --> extract character from a string 
String str1 = 'hello there Welcome!';//counting starts from 0 only
int ext = str1.charAt(4);//System.out.println(str1.charAt(4));
System.out.println(ext);//o

//indexOf --> locate a character 
String str = "whats up guyzzzzz";
System.out.println(str.indexOf("t"));//3    returns the index of that element you have passed inside semi-colons
//NOTE- if the given element is not found it will return -1 i.e is 0.

//substring --> extract a part from the string
String str = "good afternoon";
System.out.print(str.substring(2,6));//"od a" , from starting till "n-1".

//UpperCase & LowerCase
String str = 'Hey there you guys';
System.out.println(str.toUpperCase());//HEY THERE YO GUYS
System.out.println(str.toLowerCase());//hey there you guys


//replace
String str2 = "Hi there my name is Kushal";
System.out.println(str2.replace("Hi","Hello"));//Hello there my name is Kushal

//Integer To String
int i = 158;
System.out.println(Integer.toString(i) + "is a string");//158 is a string

//trim --> removes the blank spaces from the beginning and end
String str1 = "    hi there     ";
System.out.println(str1.trim());//hi there


//append --> add element at the end of an string

//Buffer --> add element during runtime(dynamic)
StringBuffer str = new StringBuffer("abcdef");
str.append("456");//start to add elements from the end of an string
str.insert(2,"whats up");//insert elements from that position
str.reverse();//reverse a string


//Method --> a function(which gonna do something)/perform an action
//A Method is consist of name,return type,access modifiers,parameters(arguments)
//Access Modifier(the way of accessing your own method) -->1)public, 2)private, 3)protected, 4)default
//1) public - can be accessed from anywhere
//2) private - accessable to that block only, where it is used, same class,different class cannot access.
//3) protected - accessable to sub-class
//4) default - accessable to same class & package, but cannot be accessed by different/other packages.

1)
public void addToNumbers(int num1, int num2){ //two arguments 'num1, num2' are passed as an parameter, 'Void' is the return type. 
	System.out.println(num1 + num2);//body of the method & displaying the result
}

2)
public String minorOrAdult(int age){
	if(age >= 18){
		return "Adult";
	}else{
		return "Minor";
	}
}
//'main' method were we are calling the above method/checking wheather he/she is a minor or adult
public static void main(String args[]){
	int a = 34;
	int result = minorOrAdult(a);//'minorOrAdult' is being called/invoked
	System.out.println(result);//points to the return-'String'. or you can say what is your return type
}
// public double factorialOfANumber(int f, int n){
// 	f = f * i;
// }
// //main
// public static void main(String args[]){
// 	int fact = 5;
// 	int resultOfAFactorial = factorialOfANumber(fact);
// 	System.out.println("The Factorial is", +resultOfAFactorial);
// }

//Class --> is a blueprint/template for an object which consist of characteristics(variable) & behaviour(function/method) as a whole in a one single unit.
//object --> an instance of a class. [EX]-class-human
//										  object-man, woman, child(instance of a class)

public class Fruits{
	String f1,f2;
	void looks(){
		System.out.println("So its a"+f1);
		System.out.println("So its an"+f2);
	}
	public static void main(String args[]){
		Fruits.obj = new Fruits();//instance of an class created a.k.a an object 
		obj.f1='APPLE';//reference variable call & storing value
		obj.f2='ORANGE';//reference variable call & storing value
		obj.looks();//ref. obj call
	}
	
}

//Constructor --> a robot, well, a constructor is mostly used for initilizing the object.
//NOTE: 1)class name and constructor name are same
//		2)constructor does'nt return
//		3)a member method
//  	4)a memory is allocated for an object in the heap memory

class hello
{
	hello(){ //constructor -->default constructor
		System.out.print("whats up bitch");
	}
public static void main(String[] args) {
	hello.obj=new hello();//creates obj, call constructor automatically i.e means you dont have to create an object with dot notation to access that property of an obj.
}}


//this keyword --> represent the current object

//Instance variable & Local variable --> instance-defined within the class(scope-works in the current class)
//										 local-defined within the method(scope-within the method block were it is defined)


//Inheritance --> a class which inherits from another class.[properties are inherited from parent class to child class]
//class -- sub_class
//overriding
1)
public class Animal{
	....//properties
	....//method
}
class lion extends Animal{
	...//taking properties from parent 
	...
}

2)
class Number{
	int test(int num){
		return num;
	}
}
class newNumber extends Number{
	int test(int num){
		return 100 + num;
	}
}
//static variable -->a variable value which remains constant throught the whole program

//Polymorphism --> same method different behaviour. 'Poly' means many, 'Morphism' means behaviour.
//overloading --> two or more methods present in the same class with different parameters.
// overriding --> a method of sub-class can overide the method of super-class,if the method name and arguments are the same.

class A{
	public void show(){
		System.out.println("hello");
	}
	public void show(string s){
		System.out.println("hi");
	}
}
A obj = new A();
obj.show();

//packages --> means folder java/io.* -- '*' is a class which will fetch all the classes from the 'io' package.


//abstraction --> hiding implementation details and showing functionality to the user. EX - mobile phone, when we are calling someone.
//a method which you declare is called an abstract that means you can't define it.
//partial implementation.
//EX - http servlet

//Concrete Class --> fully implementation(100%)

abstract class Mobile{
	public void camera(){
		...
		...
	}
	public void backCamera(){
		...//backligt can be used as flash/torch
		...
	}
	abstract void frontCamera(){//declare but not defined(abstract)-->
			...//no idea what the front flash gonna be use for ???!!
			...//thats why we are declaring
	}
}

//Interface -->EX- plan,idea. An interface is created for user, in which user can define and uses his/her method.
//EX - School registration form.
//EX - servlet
//Defination --> When we dont know anything about implementation,we just have required specification, then we should go for interface


//Method class from 'another class'
1)
class A{//class created
	public void add(){//method declare
		System.out.print('The two are added');
	}
}
	class main(){//main class created
		public static void main(String args[]){
			A.add();//calling a method of another class from another class
		}
	}

//Exception --> nobody thought of this(error) might occur.
//Defination -->is an error which occurs during the running of a program that breaks the normal flow of commands.
//EX -->JVM run out of memory.
// NullPointerException, ArithematicException, ArrayIndexOutOfBoundsException, ClassCastException

import java.lang.*;
public class exp{
	public static void main(String args[]){
		int a = 10;
		int b = 0;
		int c = a/b;// infinity
		System.out.print(c);//error will be thrown away(ArithematicException)
	}
}


//Unchecked Exception --> Occurs during runtime(Runtime Exception)
//Checked Exception --> compile-time exception which cant be ignored. 
//ArrayIndexOutOfBoundsException --> when you declare an array of 5 elements and you want to access the 6th element from that array then
//									 that time this error is popped out.
//import java.lang.Exception class;
//In java.lang the "exception class" is a sub-class and that class is divided into two sub-classes which are - I/O exception class, &
//																											   Runtime exception class.


//Try - Catch Exception --> a method which catches exception. try/catch block are placed around the code which may generate an error/s.
try{
	...//protected block
	...//if an error might/you think will occur in your code you put it in a try block
}
catch(exceptionName e){
	//catch block
	//when an exception is occured, that exception is handled by an catch block. That's why the catch block is placed right after the try block.
}

EX
import java.io.*;
public class tryCatch{
	public static void main(String[] args) {
	try{
		int a [] = new int[2];
		System.out.print("access 3rd element" + a[3]);//exception occurs
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception thrown out" + e);//catch invoked, coudn't be solved,so gets out of the block
	}	
	System.out.println("out of the block");//this block will be executed
	}
}

//multiple catch block --> since java 7
try{
	//protected code
} catch(exceptionName e){
	//code
} catch(exceptionName e1){
	//code
} catch(exceptionName e2){
	//code
} 

//throws --> is used to postpone the handling of a checked exception.
//throw --> is used to evoke an exception explicitly.
//final --> is an enity which can be assigned once and cannot be changed

import java.io.*;
public class exception{
	public void add(int a) throws ArithmeticException{
		//working
		throw new ArithmeticException();
	}
	System.out.println();
	}

//My own Exception -- must be a child of Throwable.
//		Syntax
		class myException extends Exception{

		}




