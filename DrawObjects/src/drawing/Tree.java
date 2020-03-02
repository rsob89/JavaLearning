package drawing;

import interaction.ContactWithUser;

public class Tree implements Drawable {

    ContactWithUser cwu;

    public Tree(ContactWithUser cwu) {
        this.cwu = cwu;
    }

    @Override
    public void draw() {
        cwu.printOut("Podaj wysokość choinki: \n");
        int a = cwu.gotNumber();
        int star = 1;
        for (int i = 0 ; i < a ; ++i){
            emptySpaces(a-i);
            stars(star);
            cwu.printOut("\n");
            star += 2;
        }

    }

    public void emptySpaces(int a){
        for (int i = 0 ; i < a ; i++){
            cwu.printOut(" ");
        }
    }

    public void stars(int a){
        for(int i = 0 ; i < a ; i++){
            cwu.printOut("*");
        }
    }
}
