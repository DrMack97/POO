package LISTAS;

import java.util.ArrayList;
import java.util.List;

public class mailAgent_copy {

    private List<Message> inBox;

    private List<Message> sentBox;
    private List<Message> readBox;
    private int maxMessage;
    
    public mailAgent_copy() {
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

        Message msg  = inBox.get(idx);

        readBox.add(msg);

        inBox.remove(idx);
    }

    /**
     * Donat un missatge l'ha de guardar a la llista de enviats
     *
     */
    public void sendMessage(Message msg){
        sentBox.add(msg);
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

    for (int i = 0; i < listMessages.size(); i++) {
        // 1. Obtenemos el mensaje en la posición 'i'
        Message m = listMessages.get(i);

        // 2. Imprimimos el índice y el remitente para que sea una lista limpia
        System.out.println(i + "de > "+ m.getSender());
    }
        
    }

    public void showBox(BoxEnum box) throws BoxNotFoundException{
        List<Message> listaAEscribir = selectBox(box);
        
        System.out.println(listaAEscribir);
    }
    
    

}
