package logic;

import logic.data.ClientData;
import logic.state.IState;
import logic.state.Start;
import logic.utils.EnumStates;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client {
    private static final long serialVersionUID = 2L;
    private IState state;
    private ClientData data;

    public Client(int serverPort, String inetAddressName) {
        try {
            InetAddress inetAddress = InetAddress.getByName(inetAddressName);
            data = new ClientData(serverPort, inetAddress);
            state = (IState) new Start(data);
        } catch (UnknownHostException e) {
            System.err.println("ERROR: Unknown Host Exception" + e);
            e.printStackTrace();
            return;
        }
    }

    public EnumStates getState() {
        return state.getState();
    }

    private void setState(IState state) {
        this.state = state;
    }
}
