package handler_chaining;

//Concrete Handler class
public class ConcreteHandlerA extends Handler {
 @Override
 public String handle(String request) {
     if (request.equals("A")) {
         return "Handler A: " + request;
     }
     if (nextHandler != null) {
         return nextHandler.handle(request);
     }
     return null;
 }
}
