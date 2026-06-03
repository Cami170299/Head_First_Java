# Interfaces & Abstract Classes

To understand what really an interface does and how it behaves we need to understand first what the keyword **abstract** means for a class.

## Abstract Classes

In short an **abstract** class is type of class that cannot be instantiated. They do no have enough definition to become an object, so by this definition there are two types of classes "**abstract**" and "**concrete**". So one can be instantiated and the other one not.

Ex.

```Java
abstract class Canine extends Animal {
  public void roam(){
    // do something
  }
}
```

In this example the "**abstract**" keyword makes the compiler guarantee that in no situation there will be a "new" instance (a.k.a Object) of that class.

- <b>You can also use the "abstract" keyword with methods !!</b>

This is mostly useful when you cannot create a general purpose (specific enough) code that will work for any possible future class's implementation for that method, so you make it a requirement, a protocol. If your class is called the method in question must be overridden.

```Java
abstract class Animal {
  // we leave only the declaration NO {} BODY for the method
  public abstract void eat();
}
```

<b>NOTE:</b>If you declare a method as "abstract" the class MUST be "abstract" as well, as you cannot have an abstract method inside of a non-abstract class.


