# Introduction to Programming 

**Programming** is a way to instruct a computer to perform various tasks.

**Programming Languages:** It is a computer language used by programmers to communicate with computers. Instructing computers in Binary (zeros and ones) is very difficult for humans, so to solve this issue we have these.

---

## 🗺️ Types of Languages

### 📋 Procedural Language:
* Specifies a series of well-structured steps and procedures to compose a program.
* Contains a systematic order of statements, functions, and commands to complete a task.

### 🧪 Functional Language:
* Writing a program only in pure functions that never modify variables, but only create new ones as an output.
* Used in situations where we have to perform lots of different operations on the same set of data, like ML (Machine Learning).
* Features **First-Class Functions** (functions treated as variables).

### 🧱 Object-Oriented Language:
* Revolves entirely around objects.
* **Formula:** Code + Data = Object.
* Developed to make it easier to develop, debug, reuse, and maintain software.

> 💡 **Note:** One programming language can belong to all three types (e.g., Python).
> ☕ **Java** follows both procedural and object-oriented paradigms.

---

### 🔒 Static Languages:
* Perform type checking at **compile time**.
* Errors will show up immediately at compile time.
* You must declare the datatype explicitly before you use a variable.
* Gives the programmer more control over safety.

### 🌪️ Dynamic Languages:
* Perform type checking at **runtime**.
* Errors might not show up until that specific line of code is run.
* No need to declare the datatypes of the variables beforehand.
* Saves time while writing code, but might give unexpected errors at runtime.

---

## 🧠 Memory Management

Two types of memory allocation:
### 🥞 Stack Memory:
* Stores reference variables and primitive data types.

### ⛰️ Heap Memory:
* Stores the actual objects that reference variables point to.

```text
a = 10 
[Reference Variable (Stack)] ---> [Actual Object (Heap)]
```

* Here, `a` is called the reference variable and `10` is the object.

---

## 📌 Points to Remember

1. 🔗 **Multi-Pointer References:** More than one reference variable can point toward the same object in heap memory.
2. 🌊 **The Ripple Effect:** If one reference variable changes the shared object, it changes for all others pointing to it.
3. 🧱 **Classes vs. Objects:** A class is just a template/blueprint, while an object is a real-world instance of that class.
   * *Example:* "Human" is a class, but individual people are the specific objects.
4. ♻️ **Garbage Collection:** Objects without any reference variables are called orphaned objects. The Garbage Collector (Yamraj) will automatically delete them to free up memory.
5. 🌪️ **Dynamic Re-assignment:** In dynamic languages, you can change a variable's data type suddenly. The old abandoned value left on the heap is instantly collected by the garbage collector.