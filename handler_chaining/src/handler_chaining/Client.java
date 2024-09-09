package handler_chaining;

//Client class
public class Client {
 public static void main(String[] args) {
     // Create handlers
     Handler handlerA = new ConcreteHandlerA();
     Handler handlerB = new ConcreteHandlerB();
     Handler handlerC = new ConcreteHandlerC();

     // Set the chain of handlers
     handlerA.setNext(handlerB);
     handlerB.setNext(handlerC);

     // Test the request handler
     System.out.println(handlerA.handle("A"));
     System.out.println(handlerA.handle("B"));
     System.out.println(handlerA.handle("C"));
     System.out.println(handlerA.handle("D"));
 }
}
