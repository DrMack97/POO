package LISTAS;

public class Message {
    private String sender;
    private String recibe;
    private String message;
    
    public Message(String sender, String recibe, String message){
        this.sender = sender;
        this.recibe = recibe;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public String getRecibe() {
        return recibe;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    }
}
