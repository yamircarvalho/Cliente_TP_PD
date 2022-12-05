package logic.data;

import java.net.InetAddress;

public class ClientData {
    private int  serverPort;
    private InetAddress inetAddress;

    public ClientData(int serverPort, InetAddress inetAddress) {
        this.serverPort = serverPort;
        this.inetAddress = inetAddress;
    }

    public int getServerPort() {
        return serverPort;
    }

    public InetAddress getInetAddress() {
        return inetAddress;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public void setInetAddress(InetAddress inetAddress) {
        this.inetAddress = inetAddress;
    }
}
