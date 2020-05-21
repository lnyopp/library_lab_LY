This repository  is my work on the following lab:



# Object Oriented Programming Day 2- LAB
The following instructions are to follow the lecture on Object Oriented Programming.  These should be done in a tool that allows for immediate compilation as some of the instructions will be to enter something that will break.  This is in order to see how the compiler enforces some of the language rules.   There will also be heavy use of the the `System.out.println()` method to see the results once the code compiles.

Keep in mind the instruction *can* be written in a plan text editor and then compiled on the command line using `javac` but the process will be much slower.

This lab will consist of writing code but (probably) will not end up with a fully functional system.  It may however, be used as the basis for a future project so it is imperative to be as complete as possible even though a fully functioning system may not be completed in the amount of time given for this lab.

Think about a design for a library management system.  Obviously the first type thing you think of is a book. But this is actually a *specific* type of item in a library.  A book is a type of *LibraryItem*, of which there can be many types.  A book is one type, but how about other types such as a Periodical with further sub-types such as magazine or newspaper?

> **Pro Tip** | Find yourself in need of some refreshers on some OOP basics? Check out these articles:
>
> * [OOP Basics with Java](https://www3.ntu.edu.sg/home/ehchua/programming/java/J3a_OOPBasics.html)
> * [Java Tutorial: Object Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)
> * [Inheritance vs. Composition](https://www.w3resource.com/java-tutorial/inheritance-composition-relationship.php)



Design a class hierarchy for the items in a library using the following guidelines:

* `LibraryItem` is a base class, two immediate derived classes are `Book` and `Periodical`.  Derived from `Book` are `ReferenceBook` and `GeneralBook`, and from `Periodical` are `Magazine` and `NewsPaper`.
* What other types can derive from `LibraryItem`?  Audio? Video?  And sub-types of them could be?
* What is common to all `LibraryItems`?  To `Book`?  Make sure the properties and methods are in their appropriate place, and overridden where necessary.

* A common line of thinking is this: If you find yourself defining the same property in many derived classes, this indicates the property *could* be defined in a base class.  The same with methods - if there is a similar method definition occurring in many child classes, or a definition that is only *slightly* different, this may be a base class method that can be overridden when necessary.

Write a class for a `CardHolder` to represent someone who joined the library and can check out items, reserve items, etc.

