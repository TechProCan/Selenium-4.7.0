package interviewCode;

public class interviewExamples {
    public static void main(String[] args) {

        /*There are many possible questions that could be asked of a QA test engineer who is familiar with Java. Some examples include:
1-Can you explain the difference between a static and non-static method in Java?
-A static method is a method that belongs to a class rather than to an instance of a class. This means that you can call a static method without creating an instance of the class. A non-static method, on the other hand, belongs to an instance of a class and must be called on an instance of the class.
2-How do you handle exceptions in Java? Can you provide an example of how to "catch" and "throw" an exception?
-In Java, exceptions are events that occur during the execution of a program that disrupt the normal flow of instructions. Exceptions are typically handled using try-catch blocks. To catch an exception, you use the "try" keyword followed by a block of code, and then specify one or more "catch" blocks to handle any exceptions that are thrown in the try block. To throw an exception, you use the "throw" keyword followed by an instance of the exception you want to throw. Here is an example:
try {
    // code that might throw an exception
} catch (ExceptionType e) {
    // code to handle the exception
}

3-Can you explain the purpose of the "final" keyword in Java, and give an example of when it might be used?

-The final keyword in Java is used to indicate that a variable, method, or class cannot be changed. For variables, this means that the variable cannot be assigned a new value after it is initialized. For methods, this means that the method cannot be overridden by a subclass. For classes, this means that the class cannot be subclassed. An example of when the final keyword might be used is when you have a variable that should always hold the same value, such as a constant.
 4-How do you create and use a class in Java? Can you provide an example of a simple class with a constructor, a method, and some instance variables?
 -To create a class in Java, you use the "class" keyword followed by the name of the class. Inside the class, you can define constructors, methods, and instance variables. A constructor is a special method that is used to create an instance of the class. A method is a block of code that performs a specific task. An instance variable is a variable that belongs to an instance of the class and contains data that is specific to that instance. Here is an example of a simple class with a constructor, a method, and an instance variable:

 class Example {
    private int x;  // instance variable

    // constructor
    public Example(int x) {
        this.x = x;
    }

    // method
    public void printX() {
        System.out.println(x);
    }
}
5-Can you describe the difference between a primitive type and a reference type in Java? When would you use each?

-In Java, a primitive type is a type of data that is defined by the language itself, such as "int", "double", and "boolean". A reference type, on the other hand, is a type of data that is defined by the programmer, typically by creating a class. Primitive types are generally faster and more memory-efficient than reference types, but they are also more limited in functionality. You would typically use a primitive type when you need to store a simple value, such as a number or a flag. You would use a reference type when you need to store more complex data or to define custom behavior.

6-Can you explain the difference between method overloading and method overriding in Java, and provide an example of each?

-Method overloading and method overriding are two related but distinct concepts in Java. Method overloading refers to the ability to define multiple methods with the same name but different parameter lists in the same class. This allows you to write more concise and readable code by providing multiple ways to invoke the same operation. Method overriding, on the other hand, refers to the ability of a subclass to redefine a method that it inherits from a superclass. This allows a subclass to provide its own implementation of the method that is more specific to its needs. Here is an example of method over

7-What is a Java annotation, and when would you use one? Can you provide an example of a custom annotation?

-A Java annotation is a special type of syntax that can be added to a Java class, method, or variable. Annotations are used to provide additional information about the code, such as its purpose, how it should be used, or any special behavior it has. Annotations are typically processed by tools or libraries, rather than by the Java compiler itself. Here is an example of a custom annotation:

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestMethod {
    String description() default "";
    int timeout() default 1000;
}

8-Can you describe the purpose of the abstract keyword in Java, and give an example of when it might be used in a class or method?

-The "abstract" keyword in Java is used to indicate that a class or method is incomplete and must be implemented by a subclass or concrete class. An "abstract" class cannot be instantiated, and an "abstract" method must be overridden by a subclass. An example of when the "abstract" keyword might be used in a class is when you want to define a common interface for a group of related classes, but the implementation of the interface will vary depending on the specific subclass. An example of when the "abstract" keyword might be used in a method is when you want to provide a default implementation of a method that can be overridden by subclasses, but you do not want to allow the method to be called directly on the abstract class.
9-Can you explain the difference between a HashMap and a TreeMap in Java? When would you use each?

-A "HashMap" and a "TreeMap" are both implementations of the "Map" interface in Java, which is used to store key-value pairs. A "HashMap" stores its entries in a hash table, which provides fast lookups and updates, but does not guarantee any specific order for the entries. A "TreeMap", on the other hand, stores its entries in a red-black tree, which provides slower lookups and updates but maintains the entries in ascending order based on the keys. You would typically use a "HashMap" when you do not need the entries to be ordered, and you would use a "TreeMap" when you need the entries to be sorted by their keys.

10-Can you provide an example of how to use the synchronized keyword to ensure thread safety in a Java application?

--The "synchronized" keyword in Java is used to ensure that only one thread can execute a specific block of code at a time. This is useful when you have shared data that can be accessed by multiple threads and you need to prevent race conditions or other concurrent access issues. To use the "synchronized" keyword, you specify it before the block of code you want to synchronize, and then provide an object that will be used as the lock for the synchronized block. Here is an example:

public class Counter {
    private int value = 0;
    private Object lock = new Object();

    public void increment() {
        synchronized(lock) {
            value++;
        }
    }

    public int getValue() {
        synchronized(lock) {
            return value;
        }
    }
}

11-Can you describe the purpose of the interface keyword in Java, and give an example of when it might be used?

--
*/
    }
}
