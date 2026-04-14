# Performance Engineering - Heap Dump Analysis and Insights

## What is Heap and What is Garbage Collector?

![alt text](image-276.png)

> All have a managed memory space where objects live and some form of automatic memory reclamation, which is also called garbage collection.

* **What is Heap?**
  * Heap is the memory area where objects are stored.
  * It is managed by JVM(Java virtual machine)


```txt
Think of it like a warehouse where all the products created in your factory are stored.

Similarly, all the objects created by the Java program are stored in the heap.

The heap is part of a memory used for storing the objects created by your application.
```

* **What is Garbage Collector(GC)?**
  * Garbage Collection(GC) is a Program or process, which cleans up unused objects to free up space

Analogy - 

![alt text](image-277.png)

```txt
Here guests have already finished eating and they have vacated the seat and those responsible for removing

this used plate, you can call it as a garbage collector and they will be removing plates which are

being unused, means guests have already completed eating and they have left this place.
```
> Similarly, in a Java program, the objects that are no longer being used will be cleaned up by the garbage collector, and this garbage collector will help to free up the space for the other objects.

## What is Heap Dump?
* A **heap dump** is a **snapshot** of the **heap memory** of a Java application at a specific point in time.
* Heap Dump is helpful to
  * Identify Memory Leak
  * Understand Memory Usage

* Heap Dump - Real - world Example
  

```txt
Imagine a library with many shelves where books are stored and each shelf has a limited space.

Every book will have a some kind of a tag to indicate that whether it is a science book or a maths book

or a fiction book, so on.

And some books might also have a relation with other books, indicating that it is a part of a series

of books.

A heap dump is creating a inventory list of all the books available in the library at a given point

of time.

It will help to indicate how books are organized in a library.
```

![alt text](image-278.png)

## When to Take Heap Dump? Scenarios and Situations