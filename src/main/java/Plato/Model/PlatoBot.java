package Plato.Model;

import java.util.ArrayList;

public class PlatoBot {
    private ArrayList<String> platoBotMessage;

    public void setPlatoBotMessage(ArrayList<String> platoBotMessage) {
        this.platoBotMessage = platoBotMessage;
    }

    public ArrayList<String> getPlatoBotMessage() {
        return platoBotMessage;
    }

    public void addMessage(String message){
        platoBotMessage.add(message);
    }
}
