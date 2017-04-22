// Invoker
public class Waitress {
    Command command;

    public void takeOrder(Command c){
        command = c;
        command.orderUp();
    }
}
