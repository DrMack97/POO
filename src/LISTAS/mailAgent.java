package LISTAS;

import java.util.ArrayList;
import java.util.List;

public class mailAgent {

    private List<Message> inBox;
    private List<Message> sentBox;
    private List<Message> readBox;
    private int maxMessage;
    
    public mailAgent() {
        maxMessage = 50;
        inBox = new ArrayList<>();
        sentBox = new ArrayList<>();
        readBox = new ArrayList<>();
    }

    public void recieveMessage(Message msg){
        if(inBox.size() < maxMessage){
            inBox.add(msg);
        }else{
            System.out.println("ERROR: max messages in box");
        }
    }

    public void readMessageInBox(int idx) throws IndexOutOfBoundsException {

        Message readMesssage = inBox.remove(idx);

        System.out.println(readMesssage);

        readBox.addFirst(readMesssage);

    }

    /**
     * Donat un missatge l'ha de guardar a la llista de enviats
     *
     */
    public void sendMessage(Message msg){
        if(sentBox.size() < maxMessage){
            sentBox.add(msg);
        }else{
            System.out.println("ERROR: max messages sent box");
        }
    }
    

    public List<Message> selectBox(BoxEnum box) throws BoxNotFoundException{

            List<Message> selectedList;

            switch (box) {
                case IN:
                    selectedList = inBox;
                    break;
                case SENT:
                    selectedList = sentBox;
                    break;
                case READ:
                    selectedList = readBox;
                    break;
                
                default:
                    throw new BoxNotFoundException();
                    
            }

            return selectedList;

    }

    public void printBox(List<Message> listMessages){

        for(Message m : listMessages){
            String showMessage = m.getMessage();

            if(m.getMessage().length() > 20){
                showMessage = m.getMessage().substring(0, 20) + "[...]";
            }

            System.out.println("["+m.getSender()+"]: "+showMessage);
        }

    }

    public void showBox(BoxEnum box) throws BoxNotFoundException{
        
        List<Message> showBox = selectBox(box);
        printBox(showBox);

    }
    
    

}
