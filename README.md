Week 2 of Month-1. My 12 month journey of learning how to code in Java. 

============================ Day 1 ============================ 
Java is an Object-Oriented-Programming (OOP) Language, everything in the real world of Java is associated with classes and objects. For example a car, it has color, doors, and it also has, methods of brakes, turning, and reversing. 
Java OOP also makes it possible to move coding from a procedural way into coding using objects and methods. OOP is faster to build and it is very clean coding. 
It makes it possible to adhere to the "DRY" principle (Don't Repeat Yourself). 
Java’s OOP is built on four main principles: Encapsulation, Inheritance, Polymorphism, and Abstraction — each helping organize, secure, and reuse code efficiently. 

============================ Day 2 ============================ 
I learned about Constructors, "this" keyword and object state. A constructor is a special method that we use to initialize objects. When an object of a class is created a constructor is automatically called. 
It is also very important to note that when creating a constructor it should take the name of the class and it cannot have a return type. 
Constructor overloading is when we have multiple constructors within the same class but have different parameter list.
Default constructor is in the case that you don't create a constructor, a default constructor will be created and it will have no-arguments. 
The "this" keyword, refers to the current object in a method or constructor, it can also be used as ("this()") when a constructor calls another constructor in the same class. 
It must be the first statement inside the constructor. Object state, this refers to the current data an object holds, represented by its instance variables/fields. 
The Object lifecycle is the stages it goes through, from initialization/Creation to usage, modification, and dumping/destruction stage. 
Also the "this" keyword is very useful in a case where a constructor or method has a parameter with the same name as a class variable, we can use the "this" keyword to update the class variable correctly. 

============================ Day 3 ============================ 
I learned about Encapsulation and Access Modifiers. Encapsulation is a very important part of OOP, sometimes it is important to prevent access to certain data within a software,
but at the same time wanting to grant access to the software, so we set the code such that permission should first be requested and then granted to be able to use certain parts of the code. 
We make use of Getters and Setters to set values to variables that are private and get information about them. Encapsulation makes the code more maintainable by controlling how data is accessed and changed, 
reducing bugs and unintended side effects. It is also important to note that the Set method does not return any value while the get method must be specified what type of data to return. 
Encapsulation increases security. Access Modifiers, we have 4 types being private, protected, public and default. 
1. Private can only be accessed in the same class. 2. Public can be accessed by all classes. 3. Protected, the code is accessible in the same package, and subclasses.
4. Default, the code is only available in the same package and no modifier.

============================ Day 4 ============================
I learned about Inheritance & Code Reuse. Inheritance is the ability of one class or method to inherit anothers attributes and methods.
It is grouped into two categories being "super-class (Parent)" and "sub-class (Child)". Super-class is the class being inherited which makes it the parent.
Sub-class is the class that inherits super-class making it the child. To be able to inherit a class you must use the "extends" keyword.
Inheritance is very useful for reusability, also to reuse attributes and methods of one class on the other newly created class.
I also learned about the "super" keyword. It is basically used to refer to the parent class of the subclass, it makes it easy to identify a parent class when the same methods are being used.
It can be used to call the parents constructor methods and its attributes.
Single vs. Multilevel Inheritance: “Java supports single and multilevel inheritance (A → B → C) but not multiple inheritance (a class cannot extend more than one class).”
Override Example: A subclass can redefine (override) a method from the parent class to provide its own implementation.

============================ Day 5 ============================
I learned about Polymorphism & Method Overriding. Polymorphism simply means many-forms, it happens mostly when too many classes relate to each other by inheritance.
Polymorphism allows us to perform the tasks using the same methods but in many different forms. Method overriding is when say a method is created in an interface and the interface is implemented in some classes,
the method is now being overridden in the classes that implement the interface.
I also learned about dynamic method dispatch, which is when, during the run of the process code is executed and it is during runtime where a method chooses between the reference given and the object being used as to which code to execute.
Compile-time vs. Runtime Polymorphism: ●Compile-time → method overloading and ●Runtime → method overriding Upcasting means treating a subclass object as a parent type.
It allows Java to decide at runtime which overridden method to call — that’s dynamic method dispatch.”

============================ Day 6 ============================
I learned about Abstraction (Abstract Classes & Interfaces). The principle of abstraction is simple and straight forward, when a class like "Person" for instance is created along with other classes like doctors,
engineers etc, certain attributes and methods created in the person class are common like names, age, gender; meaning an engineer has them as well as a doctor has them and again we cannot created in the real world an object of a person because it is too general,
it is because of this reasons why "Person" class can become abstract class because we want the same details from an engineer and from the doctor.
Abstract Methods: “An abstract class can contain both abstract methods (without body) and concrete methods (with body). Abstract methods must be implemented in the child class.”
Interfaces are very necessary for when there is a need for a contract amongst classes, for instance in an interface there can be a method created such as work(), it's important to note that it must not have a body inside the interface,
so any class that implements the interface, will by force have to use the method created inside the interface and give it a body.
Interface Rules (Modern Java): ●All methods are public and abstract by default. ●From Java 8+, interfaces can also have default and static methods with bodies.
When to Use Which: Use an abstract class when you need shared state or behavior (fields + methods). Use an interface when you need to define a contract (methods only) that multiple classes can implement, even if they are unrelated.
