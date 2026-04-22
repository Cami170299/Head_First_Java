# Constructors & The Garbage collection heap

Every Object in Java has a live cycle, Generally speaking, once an instance of an object is created, it gets abandoned and later "erased" thanks to the Garbage Collector.

<b>LIVE CYCLE</b>:

1. Get created
2. Get Abandoned
3. Get erased by the Garbage Collectable heap.

All Objects live in the (heap), and method invocation "actions" & local variables live int the (stack).

Not all variables live in the heap, in fact there are 2 types of variables whose lives are stored in different places.

- <b>Instance Variables</b>
  - Instance Variables are the ones stored inside a Class. This means they are part of that Class that has been instantiated.
- <b>Local Variables</b>
  - Local Variables are the ones stored inside a Method. Which means they only live as long as they live in the stack (Other words until the method has not read the closing '}')

## The birth of objects

Every time we are creating an object, when we instantiate the object ex. "new Duck();" it looks like we are calling an object. Doesn't it ? But we are not, what we are actually calling is a <b>Constructor</b>.

The constructor runs right before the assignation step. The general use of constructor is to set Instance Variables for an object before the assignation.

Ex.

```Java
public class Duck {
  private int size;

  public Duck(int duckSize){
    if (duckSize != 0){
      size = duckSize;
    } else {
      size = 0;
    }
    System.out.println("The size has been set to: " + this.size);
  }

  // NOTE: Constructors have defaults;
  // Primitives = 0 or 0.0
  // Booleans = false
  // references = null

}
```

## Constructors

Key Concepts;
  - <b>this():</b> it's use to call all the constructors inside the main one, so you can overload the constructors and delegate some default values if necessary. Ex. this("Jane Doe")
9
  - <b>super():</b> use to call the superclass constructors and add more logic on top of it.
  - 

