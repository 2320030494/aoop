package handler_chaining;

//Abstract Handler class
public abstract class Handler {
 protected Handler nextHandler;

 public void setNext(Handler nextHandler) {
     this.nextHandler = nextHandler;
 }

 public abstract String handle(String request);
}