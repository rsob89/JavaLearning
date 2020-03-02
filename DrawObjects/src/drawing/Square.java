package drawing;

import interaction.ContactWithUser;

public class Square implements Drawable {

    ContactWithUser cwu;

    public Square(ContactWithUser cwu) {
        this.cwu = cwu;
    }

    @Override
    public void draw() {
        cwu.printOut("Podaj długość boku kwadratu: \n");
        int a = cwu.gotNumber();
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < a ; j++) {
                cwu.printOut("*  ");
            }
            cwu.printOut("\n");
        }

    }
}
