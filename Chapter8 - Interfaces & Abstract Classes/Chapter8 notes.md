# Interfaces & Abstract Classes

To understand what really an interface does and how it behaves we need to understand first what the keyword **abstract** means for a class.

## Abstract Classes

In short an **abstract** class is type of class that cannot be instantiated because they do not count with enough definition to become an object, so if we follow this logic there must be two types of classes 1."**abstract**" and 2."**concrete**". One is instantiable the other one isn't.

Ex.

```Java
abstract class Canine extends Animal {
  public void roam(){
    // do something
  }
}
```

In this example the "**abstract**" keyword makes the compiler guarantee that in no situation there will be a new **instance** (a.k.a new Object) of that class.

- <b>NOTE:You can also use the "abstract" keyword with methods !!</b>

### Use cases

Abstract classes are useful when you cannot create a general purpose (specific enough) code that will work for ALL possible future class's implementation for that method. So you make it a requirement, a protocol. If your class is called the method in question must be overridden.

```Java
abstract class Animal {
  // we leave only the declaration NO {} BODY for the method
  public abstract void eat();
}
```

<b>NOTE:</b>If you declare even ONE method as "abstract" the class MUST be "abstract" as well, as you cannot have an abstract method inside of a non-abstract class.

## Reference variable type and assignation

It is really important that when we create an object we look closely what we are assigning to it, in Java you can declare the Object's **super-class** as the reference value type. 

For example.

Say we have this super class called **Feline**;

```Java
public class Feline{
  void drink(String liquid){
    if (liquid != ""){
      System.out.println("Dringking " + liquid);
    } else {
      System.out.println("Drinking");
    }
  }
}
```

And now we have this class called **Cat** which extends the **Feline** class;

```Java
public class Cat extends Feline{
  void eat(String solid) {
    if (solid != "") {
      System.out.println("Eating " + solid);
    } else {
      System.out.println("Eating something.");
    }
  }
}
```

If we create a new **Cat** object on main and we assign a reference variable type **Feline** to it as follows;

```Java
public class MyClass{
  public static void main(String[] args){
    Feline myCat = new Cat();
  }
}
```

**This will COMPILE**

- But why ?
Because the class **Cat** is extending the "super-class" **Feline**, therefore Cat is just a sub set of Feline (a child of feline). BUT what we CANNOT do is call the Cat's methods we are only able to call the Feline methods instead, foe example this following snipped will not compile.

```Java
myCat.eat();
```

This is because we assigned Feline as the reference value for the Cat. So we can only control what a Feline does NOT what a Cat does.

**NOTE:** You can use this property not only for assignation but also for parameters and returns;

``` Java
  public void pet(Animal a){
    a.makeNoise();
  }
```

# The notion of the "Class Object"

If we think about the idea of abstraction itself you can keep inherit more and more abstract classes until you get the "mother" of all classes, the **Object** class. This Super-class is part of the package java.lang (The default package library from Java that allows you to call the System class as well)

In short every single class you write in Java, is extending the **Object** class.
