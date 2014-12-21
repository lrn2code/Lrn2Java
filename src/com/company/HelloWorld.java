package com.company;

/**
 * This class will teach you the very basics of programming.
 * You will learn about:
 * Classes
 * Objects
 * Fields
 * Methods
 * Parameters
 *
 */


/**
 * This is a class. It is the foundation of how you want your code to work.
 * When you make a class you are defining how an object of that class will work.
 */
public class HelloWorld {
    // This is a field. Each object of a class you create can have values set for the fields you define
    // What the fields are for and how they behave is up to you!
    public String message = "hello world";


    // This is a method. Methods can be called by objects or other means to perform whatever actions you define
    public void method(){
        // This is a print method, which can print out anything you ask it to.
        // In this example we are printing the message field from our HelloWorld class.
        // message, in this case, is what would be known as a parameter
        System.out.println(message);
    }

    // This is a method with a parameter. When you call a method with parameters,
    // whatever you pass as the parameters will define the outcome of calling that method.
    public void setMessage(String newMessage){
        // In this case, the field message will be assigned the value of newMessage
        this.message = newMessage;
    }

    public static void main(String[] args) {
        // This is an object. After you use the class to define how an object works, you can create a new object in your program
        HelloWorld helloWorldObject = new HelloWorld();
        // This is how you call a method of an object, which means you are asking that object to perform the functions of that method
        helloWorldObject.method();


        // You can access fields the same way. You can also reassign them new values.
        helloWorldObject.message = "How are you, world?";
        // Let's see how this changes the object's behavior
        System.out.println(helloWorldObject.message);

        // Now let's try calling a method with a parameter...
        helloWorldObject.setMessage("I'm fine. Thanks for asking..");
        helloWorldObject.method();
    }
}

/*
* Review:
* What is an object?
*   An object is a variable with defined properties and behaviors

* What is a class?
*   The class is the blueprint of an object

* What are fields?
*   fields define the properties of a class

* What are methods?
*   methods are a set of actions performed, which are defined in a class
*
* What are parameters?
*   parameters are variables passed to a method, which determine the results of a method
* */

