public class Message{
    private String sender; 
    private String reciever;
    private String message;
   
    public Message(String sender, String reciever, String message) {
        this.sender = sender;
        this.reciever = reciever;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public String getReciever() {
        return reciever;
    }

    public String getMessage() {
        return message;
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("Sender: ").append(sender);
        sb.append("\nReciever: ").append(reciever);
        sb.append("\n").append(message);

        return sb.toString();
        
    }
    

    


}