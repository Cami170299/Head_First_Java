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
public class cat{
  void eat(String solid) {
    if (solid != "") {
      System.out.println("Eating " + solid);
    } else {
      System.out.println("Eating something.");
    }
  }
}
```
