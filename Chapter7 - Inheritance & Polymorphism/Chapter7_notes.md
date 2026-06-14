# <p align="center"> Inheritance & Polymorphism </p>

## What is Polymorphism

The ability of a single interface or symbol to represent or operate on different underlying data types.

### Types of Polymorphism

Depending how you view it, Java can support different types of Polymorphism.

1. <b>Practical stand point</b> (only 2 types based on execution time)

    - **Overloading**: This type happens when the compiler binds the methods with their name and definitions. So basically we set the same "name" for all the methods but we change the parameters. (This as you imagine happens at **Compiling Time**)

      ``` Java
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

    - **Overriding**: This type happens when a method is resolved dynamically at the run time rather than at compile time. In other words, is a subclass providing its own implementation of a method declared before by it's parent class. (**Happens at processing time**)

      ```Java
      public class subprocess extends processor {
        @Override
        public void process(){
          // Do something
        }
      }
      ```

2. <b>Theoretical stand point</b> (only 3 types based on CS categories)

    - **Ad-hoc**: which is basically Overloading.
    - **Sub type**: which is basically Overriding.
    - **Parametric**: The execution of code identically across a variety of types without relying on specific type information. Ex. "**ArrayList<TypeA> or ArrayList<TypeB>**"

## Inheritance

- Is a mechanism where a new classes can acquire "instance variables" & "methods" (a.k.a functionality) from a bigger and already existing more generic class.

### How to design inheritance ?

1. Look for objects that have a common attribute or behavior.
2. Design a class that represents a common state and behavior.
3. Decide if a subclass needs behaviors that are specific to that particular subclass type. (Override).
4. Create subclasses apart from the super-class that can encapsulate the behavior of a large group.

### Inheritance level restrictions

There are only 4 access levels that a "super-class" can look at, to either allow or deny the access to it's <b>instance variables</b> & <b>methods</b> to subsequent child classes.

- **private**
  - All <b>private</b> methods, instance variables, etc... Are NOT inherited and cannot be accessed outside the class itself, only with getters or setters.
- **default**
  - When you do not set anything for the declaration, the level of restriction is set to **default**, meaning that these methods, instance variables, etc... Are only accessible to the same package.
- **protected**
  - All methods, instance variables, etc... Are inheritable and can be access by declaring the package the class belongs to.
- **public**
  - All <b>public</b> methods, instance variables, etc... Are inherited and accessible everywhere.

### Q&A

1. #### What if I just want to add more functionality to an inherited method rather than re-writing it myself ?

You can add the <b>"super"</b> prefix to the method and call it to add your own code after, for Ex;

``` Java
  @overider
  public void roam(){
    super.roam(); // calling the parent method and adding more functionality after.
    // Do more stuff
  }
```

2. #### In the end what is the real use of Polymorphism ?

The main advantage of Polymorphism is to structure guidelines or <b>"Protocols"</b> to objects, meaning every "thing" (Object) does a certain set of actions (methods) and uses certain set of information (instance variables) to operate.
