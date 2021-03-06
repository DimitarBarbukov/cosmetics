# Java Technical Questionnaire

These are the theoretical questions that will most likely be asked during the project defenses and during the technical part of your job interviews. The idea of these questions is for them to act like a learning guide and provide the student an accurate way of measuring their understanding of the key concepts behind each course and module. As you can see, they are separated into two groups.

**1.   The first group are questions that we expect you know the answer of in great details and could answer and explain additional questions regarding them. These questions are related to the material we have covered during our onsite classes.**

**2.   The second set consists of questions that we expect you to know about and can give a basic answer, without diving deep into the subject. These questions are usually based on additional resources we provide inside the Learning Management System. You should research those topics in your spare time.**

## Core Programming

#### Questions that you must be able to answer in detail

- What is Java?
  - Java is objected-oriented programming language with general purpose.
- **What is JDK, JRE and JVM?**
- Why is `import` in Java?
- What is Generic type in Java? Can you give an example?
- Is data passed by *Reference* or by *Value* in Java?
- **What is the difference between `==` and `equals()`?**
- **What is the difference between `static` and `final` variables in Java?**
- Describe the meaning of the `final` keyword when applied to a *class*, *method*, *field* or a *local variable*.
- **What are the differences between `local`, `static` and `instance` variables?**
- **What is the difference between primitive and reference type?**
- What is autoboxing and unboxing?
- What is the difference between `String`, `StringBuilder` and `StringBuffer` in Java?
- What is Java String Pool?
- How many ways are there to create a `String` Object in Java?
- Is `String` a *Primitive* or a *Derived* Type?
- What are the benefits of strings Being *Immutable*?
- What does immutable mean? How can you design it?
- **When comparing strings, what???s the difference between `str1 == str2` and `str1.??quals(str2)`?**
- How can we convert `String` to `Integer` and `Integer` to `String` in Java?
- What is `String.format()` used for?
- How can we convert a String to a Character array?
- What is try-with???resources block in Java?
- How does Java allocate stack and heap memory?
- What is bytecode in Java?
- What is method signature in Java?
- What is return type of methods in Java?
- What are varargs?
- What is lambda expression? Give some examples of lambda expressions.
- What is a functional interface?
- When to use comparable vs comparator vs comparison with lambdas in Java?
- What are we using lambdas and method reference for?
- What is the difference between checked and unchecked exceptions?
- What are multiple catch blocks in Java?
- Is `finally` block always executed?
- How is the compiler working?
- If you have class with two methods that have the same name, but different signatures, will the class compile?
- What is the difference between Error & Exception? Why is it preferable not to catch and work with Errors?
- What is the difference between Heap & Stack memory?
- What is File? How can you read a file?
- What is Stream API in Java?
- Explain stream operations with an example?
- How many types of Stream operations are there?

#### Questions you should have general knowledge of and should answer in a few words

- Is Java code managed or unmanaged code?
- What is the role of the JVM?
- What is Ahead-of-time (AOT) compilation and bytecode in Java?
- What are functional interfaces in Java?
- How can we create our custom pool of objects, like the String Pool?
- How does garbage collector work?
- What do you know about threads?
- Can you use streams with primitives?

****

## Object Orientated Programming

#### Questions that you must be able to answer in detail

- **What are 4 OOP Principles?**
- **What is a class?**
- **What is an object?**
- What are the access modifiers in Java?
- Explain *static initializers* in Java?
- **Explain *overloading* in Java?**
- What is data *encapsulation*?
- Explain *inheritance*? Is there *multiple inheritance* in Java?
- **What is *polymorphism* in Java?**
- What is *abstraction* in Java?
- **Explain *overriding* in Java?**
- **What is `abstract class` and `interface`? What is the difference between them? What do they have in common?**
- How do we achieve strong cohesion and loose coupling?
- What is *composition*?
- What are `final` classes in Java?
- **What do we use `new`, `this` and `super` for?**
- Can we change the access modifier of a method, while overriding it?
- How many constructors one class can have? What are the differences between them?
- When do we want to make a constructor `private`?
- Can a method, inherited from a interface, have a `private` access modifier?

#### Questions you should have general knowledge of and should answer in a few words

- What are annotations in Java?
- What are covariant return types in Java? Why we can use them with overriding?

****

## Data Structures and Algorithms

#### Questions that you must be able to answer in detail

- What are data structures?
- What is a linear data structure?
- What operations can we perform on data structures?
- Explain what is a linked-list?
- Explain what is a stack?
- Explain what are queues?
- **What is the difference between `Array`, `ArrayList` and `LinkedList` in Java?**
- **`ArrayList` vs `LinkedList` which is better for different operations?**
- **What is the difference between `HashMap` and `TreeMap`?**
- **What is the implementation of the `HashMap`? How does it handle collisions?**
- What is hashing?
- Describe how hash map work. Provide some pseudo code.
- What is algorithm?
- What is algorithm analysis?
- Why do we need to do algorithm analysis?
- What are asymptotic notations?
- What is a recursive function?
- **What is linear searching?**
- **What is binary searching?**
- **What is a tree?**
- What is post-order, pre-order, in-order traversal?
- **What is a binary tree?**
- **What is a binary search tree?**
- Describe how heaps work. Write some pseudo code
- Think about and evaluate complexity of different search and sort algorithms. Explain when using array is better in some cases.

#### Questions you should have general knowledge of and should answer in a few words

- What is a graph? Provide practical examples of graphs.
- How does depth-first traversal work?
- Provide a practical example of DFS. Explain it.
- How does breadth-first traversal work?
- Provide a practical example of BFS. Explain it.
- What is interpolation search?
- How do you choose between `HashSet` vs. `TreeSet`?
- **Explain divide and conquer algorithms?**
- What is dynamic programming?
- What is Red/Black tree?

****

## High-Quality Code

#### Questions that you must be able to answer in detail

- **What is the purpose of unit tests?**
- What other types of testing do you know?
- **What makes a unit test high-quality?**
- **Give some clean code practices examples?**
- **What is SOLID?**
- Give a real-life example of Open for extension / closed for modification?
**- Explain Dependency Inversion principle and give example.**
- What is Dependency Injection? How does it work? Give a real-life example of Dependency Injection?

#### Questions you should have general knowledge of and should answer in a few words

- How do dependency injection containers work under the hood?
- What is Singleton pattern and how to design it in your class structure?
- What is lazy and eager initialization?

****

## Spring and web

#### Questions that you must be able to answer in detail

- What is Spring?
- What are some of the core modules in Spring?
- What is Java bean?
- What is JDBC and Hibernate and what is the difference?
- What is transaction and why do we use it?
- **What is HTTP?**
- **Which are the main HTTP methods?**
- **Which are the HTTP response codes?**
- What is the difference between `HTTP GET` and `HTTP POST`?
- What is the difference between `HTTP PUT` and `HTTP POST`?
- What HTTP method you???d use if you had to get resource from the server, but to do so you need to send lots of data?
- **What is the format of a HTTP request and response?**
- What is REST service?
- What is API and how can you use it?
- Explain the MVC design pattern?
- What is template engine and where do we use it?
- What is the difference between dynamic web pages and single page application (SPA)?
- What are transactions in MariaDB /Spring?

#### Questions you should have general knowledge of and should answer in a few words

- What is the role of ???enabled??? column in Spring Security Users table?
- What is Aspect Oriented Programming (AOP)?
- How does Spring Security work under the hood?
- What is database migration?

****

## Practical Tasks

- Write function to print Fibonacci numbers up to N.
- Write function to find substring in string.
- Write a function that takes a String and reverses it?
- Write a function to check if a String is a palindrome or not?
- Write a function to check if two Strings are anagrams in Java?
- Write function to print all Character permutations in given string.
- Write a function to count the number of occurrences of a given Character in a String?
- Which data structure you???d use to check whether two strings are palindromes?
- What is the fastest way of mirroring a number? 12 -> 21
- Write function to find a number in binary search tree.
- Given a string containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid. An input string is valid if:
  - Open brackets must be closed in the correct order.
  - Open brackets must be closed by the same type of brackets.
- Write function `mergeStrings("abc", "defg")` ... = `"adbecfg"`
- You have defined ???weight??? of a string. Get the lightest string with this ???weight???.
- You have several strings. How would you check whether each of them contains all letters from the alphabet?
- Find the count of unique numbers in an array. `[1,3,3,4,4,4] -> 2`

***

## Logical Tasks

- You are given two eggs, and access to a 100-storey building. Both eggs are identical. The aim is to find out the highest floor from which an egg will not break when dropped out of a window from that floor. If an egg is dropped and does not break, it is undamaged and can be dropped again. However, once an egg is broken, that???s it for that egg. If an egg breaks when dropped from floor n, then it would also have broken from any floor above that. If an egg survives a fall, then it will survive any fall shorter than that. The question is: What strategy should you adopt to minimize the number egg drops it takes to find the solution?. (And what is the worst case for the number of drops it will take?)