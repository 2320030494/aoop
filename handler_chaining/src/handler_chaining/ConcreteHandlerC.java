package handler_chaining;

//Concrete Handler class
public class ConcreteHandlerC extends Handler {
 @Override
 public String handle(String request) {
     if (request.equals("C")) {
         return "Handler C: " + request;
     }
     if (nextHandler != null) {
         return nextHandler.handle(request);
     }
     return null;
 }
}