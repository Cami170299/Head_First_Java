# Interfaces & Abstract Classes

## Abstract Classes

Abstract Classes are the ones that cannot be instantiated. They do no have enough definition to become an object. So by this definition there are two types of classes "Abstract" and "Concrete". So one can be instantiated and the other one not.

```Java
abstract class Canine extends Animal {
  public void roam(){
    // do something
  }
}
```

In this example the "abstract" makes the compiler guarantee that in no situation there will be a "new" instance (a.k.a Object) of that class. <b>BUT</b> you can still use it as a reference type.

- <b>One important thing to have in mind is that you can also use "abstract" with methods !!</b>

This means that if you "abstract" a method the method in question must be overridden. This means that it makes sense to leave the method empty as the abstract will force the new extended class to override it. 

```Java
abstract class Animal {
  // we leave only the declaration NO BODY for this method
  public abstract void eat();
}
```

<b>NOTE:</b>If you declare a method as "abstract" the class MUST be "abstract" as well, as you cannot have an abstract method inside of a non-abstract class.




