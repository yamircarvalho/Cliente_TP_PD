import logic.Client;
import ui.UIText;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2){
            System.err.println("Usage: java <name> <server port> <server address>");
            return;
        }
        Client client = new Client(Integer.parseInt(args[0]), args[1]);
        System.out.println(args[0] + args[1]);

        UIText uiText = new UIText(client);
    }
}