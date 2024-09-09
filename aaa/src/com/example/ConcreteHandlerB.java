package com.example;

//Concrete Handler class
public class ConcreteHandlerB extends Handler {
 @Override
 public String handle(String request) {
     if (request.equals("B")) {
         return "Handler B: " + request;
     }
     if (nextHandler != null) {
         return nextHandler.handle(request);
     }
     return null;
 }
}