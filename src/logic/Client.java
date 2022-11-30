package logic;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client {
    private int  serverPort;
    private InetAddress inetAddress;

    public Client(int serverPort, String inetAddressName) {
        this.serverPort = serverPort;
        try {
            this.inetAddress = InetAddress.getByName(inetAddressName);
        } catch (UnknownHostException e) {
            System.err.println("ERROR: Unknown Host Exception" + e);
        }
    }
}
