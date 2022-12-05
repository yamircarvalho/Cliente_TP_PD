package logic.state;

import logic.data.ClientData;

public abstract class StateAdapter {
    private final ClientData data;

    protected StateAdapter(ClientData data) {
        this.data = data;
    }

    public ClientData getData() {
        return data;
    }

}
