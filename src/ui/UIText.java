package ui;

import logic.Client;

import java.util.Scanner;

import static logic.utils.EnumStates.*;

public class UIText {
    private Client client;
    private final Scanner sc = new Scanner(System.in);
    private boolean sair = false;
    public UIText(Client client) {
        this.client = client;
    }

    public void corre() {
        imprime();
        while (!sair) {
            switch (client.getState()) {
                case START:
                    startState();
                    break;
                case AWAITSSIGNUP:
                    awaitSignUpState();
                    break;
                case AWAITSLOGIN:
                    awaitLogin();
                    break;
                case AWAITSCOMMAND:
                    awaitCommand();
                    break;
            }
        }
    }

    private void awaitCommand() {
    }

    private void awaitLogin() {
    }

    private void startState(){

    }
    private void awaitSignUpState() {
    }

    private static void imprime(){
        for(int i = 0; i < 50; i++){
            System.out.println("\n");
        }
    }
}
