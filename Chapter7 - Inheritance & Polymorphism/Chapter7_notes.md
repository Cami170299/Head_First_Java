# <p align="center"> Inheritance & Polymorphism </p>

## What is Polymorphism

- The ability of a single interface or symbol to represent or operate on different underlying data types.

### Types of Polymorphism

- In the Java programming language there is only tow main types of Polymorphism.

1. Compile-time Polymorphism (Overloading)
    - The decision is made after compiling the code.

A clearer way to understand it is that Overloading refers to the number of methods that have the same name but different parameters;

```Java 
public class processor {
  public void process (int i){
    // Do something
  }
  public void process (int[] i){
    // Do something
  }
  public void process (int i, float a){
    // Do something
  }
}
```

2. Runtime Polymorphism (Overriding)
    - The decision is made while running the code.

For run time is only resolve when you run the class, for example a child class with the same method name as the super class.

```Java
public class suprocess extends processor {
  @Override
  public void processor(){
    // Do something
  }
}
```

## What is Inheritance

- Is a mechanism where new classes can inherit "instance variables" & "methods" from bigger and already existent generic classes.

### How to design inheritance ?

1. Look for objects that have a common attribute or behavior
2. Design a class that represents the common state and behavior
3. Decide if a subclass needs behaviors that are specific to that particular subclass type. (Override)
4. Create subclasses a part from the super class that can encapsulate the behavior of a large group

### Inheritance level restrictions

There are only 4 access levels that a "super class" can look at, to either allow or deny the access to a its <b>instance variables</b> or <b>methods</b>.

- private
  - All <b>private</b> methods, instance variables, etc... Are NOT inherited.
- default
- protected
- public
  - All <b>public</b> methods, instance variables, etc... Are inherited.

### Q&A

1. #### What if i just want to add more information to an inherited method ?

You can add the <b>"super"</b> prefix to the method and play with it, for Ex;

``` Java
  @overider
  public void roam(){
    super.roam(); // calling the parent method and adding more functionality after.
    // Do more stuff
  }
```

2. #### What is the use of Polymorphism ?

When you use Polymorphism any subclass that extends the superclass can be used as the new object in the assignation for a superclass reference declaration.

``` Java
  Animal myAnimal = new Dog();
    // This is done because Dog "extends" Animal superclass.
```

You can use this property not only for assignation but also for arguments and returns.

``` Java
  public void pet(Animal a){
    a.makeNoise();
  }

  public void myAction(){
    Dog dog = new Dog;

    pet(dog);
  }
```

This will also allow you to set a <b>"Protocol"</b> to objects, meaning every "thing" (Object) does certain set of things and uses certain set of instance variables to operate.
