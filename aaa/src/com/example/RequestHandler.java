package com.example;

//Client class
public class RequestHandler {
 public static void main(String[] args) {
     // Create handlers
     Handler handlerA = new ConcreteHandlerA();
     Handler handlerB = new ConcreteHandlerB();

     // Set the chain of handlers
     handlerA.setNext(handlerB);

     // Test the request handler
     System.out.println(handlerA.handle("A"));  // Output: Handler A: A
     System.out.println(handlerA.handle("B"));  // Output: Handler B: B
     System.out.println(handlerA.handle("C"));  // Output: null
 }
}
