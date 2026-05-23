# ☕ Java Core: Chapter 1

## 📌 The Golden Rules of Java
* **File Naming:** The name of the file *must* excatly match the name of the public class. (e.g., `Main.java` inside your code folder will have `public class Main`)
* **Semicolons:** Every single statement must end with a semicolon `;` or the code will crash.
* **Main Method:** Every Java application needs a starting point. This is always:
  `public static void main(String[] args)`

## 🧠 How Java Works (The Ecosysytem)
1. **Source Code (.java):** The human readable code that you write in VS Code.
2. **Compiler:** Translates your `.java` file into a compressed version called **Bytecode** (`.class` file)
3. **JVM (Java Virtual Machine):** Reads that Bytecode and executes it on your computer.

## 💾 Memory Management Basics 
> **Stack vs Heap Memory:** 
> * **Stack Memory:** This is where small primitive data types live (like integers or characters). It is super fast.
> * **Help Memory:** This is where large complex things live (like Strings, Arrays, or Objects).