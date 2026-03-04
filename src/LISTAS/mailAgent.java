package LISTAS;

import java.util.List;

public class mailAgent {
    private List<Message> inBox;
    private List<Message> sentBox;
    private List<Message> readBox;
    private int maxMessage;
    
    public mailAgent(List<Message> inBox, List<Message> sentBox, List<Message> readBox, int maxMessage) {
        this.inBox = inBox;
        this.sentBox = sentBox;
        this.readBox = readBox;
        this.maxMessage = maxMessage;
    }

    public void recieveMessage(Message msg){
        if (inBox.size() < maxMessage) {
            inBox.add(msg);
        } else {
            System.out.println("ERROR: max messages in inBox");
        }
    }

    public void readMessage(int idx) throws IndexOutOfBoundsException{
        Message readMessage = inBox.remove(idx);

        System.out.println(readMessage);

        readBox.addFirst(readMessage);
    }

    public void moveFrominBoxToRead(Message msg){

    }

    

    // si hay un indexOutBoundExeption


}