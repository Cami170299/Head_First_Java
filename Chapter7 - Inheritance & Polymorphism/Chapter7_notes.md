# <p align="center"> Inheritance & Polymorphism </p>

## What is Polymorphism

The ability of a single interface or symbol to represent or operate on different underlying data types.

### Types of Polymorphism

Depending how you view it, Java can support different types of Polymorphism.

1. <b>Practical stand point</b> (only 2 based on execution time)

    - **Overloading**: This type happens when the compiler binds the methods with their name and definitions. So in basically we set the same "name" for all the methods but we change the parameters. (This as you imagine happens at **Compiling Time**)

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

    - **Overriding**: This happens when a overridden method is resolved dynamically at the run time rather than when the source code is compiled. Basically a subclass providing its own implementation of a method declared in its parent class. (**Happens at processing time**)

      ```Java
      public class subpricess extends processor {
        @Override
        public void process(){
          // Do something
        }
      }
      ```

2. <b>Theoretical stand point</b> (only 3 based on CS categories)

    - **Ad-hoc**: which is basically Overloading.
    - **Sub type**: which is basically Overriding.
    - **Parametric**: The execution of code identically across a variety of types without relying on specific type information. Ex. "**List<TypeA> or List<TypeB>**"

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
  - All <b>private</b> methods, instance variables, etc... Are NOT inherited and cannot be accessed outside the class itself, only with getters or setters.
- default
  - Are when you do not set anything for the declaration, these are only accessible to the same package.
- protected
  - They are inheritable and can be access by a subclass of a different package.
- public
  - All <b>public</b> methods, instance variables, etc... Are inherited and accessible everywhere.

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

The main advantage of Polymorphism is to structure guidelines or <b>"Protocols"</b> to objects, meaning every "thing" (Object) does a certain set of actions and uses certain set of instance variables to operate.
