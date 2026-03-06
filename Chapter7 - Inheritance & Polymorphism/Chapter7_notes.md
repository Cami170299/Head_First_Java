# <p align="center"> Inheritance & Polymorphism </p>

## What is Polymorphism

- The ability of a single interface or symbol to represent or operate on different underlying data types.

### Types of Polymorphism

1. Compile-type Polymorphism
2. Runtime Polymorphism

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

- # What if i just want to add more information to an inherited method ?

You can add the <b>"super"</b> prefix to the method and play with it, for Ex;

<code>
  public void roam(){
    super.roam();
    // Do more stuff
  }
</code>




