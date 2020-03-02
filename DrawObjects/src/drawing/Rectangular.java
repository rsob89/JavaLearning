package drawing;

import interaction.ContactWithUser;

public class Rectangular implements Drawable {

    ContactWithUser cwu;

    public Rectangular(ContactWithUser cwu) {
        this.cwu = cwu;
    }

    @Override
    public void draw() {
        cwu.printOut("Podaj długość pierwszego boku prostokąta: \n");
        int a = cwu.gotNumber();
        cwu.printOut("Podaj długość drugiego boku prostokąta: \n");
        int b = cwu.gotNumber();
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < b ; j++) {
                cwu.printOut("*  ");
            }
            cwu.printOut("\n");
        }
    }
}
