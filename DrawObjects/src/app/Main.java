package app;

import drawing.Rectangular;
import drawing.Square;
import drawing.Tree;
import exceptions.NoSuchOptionException;
import interaction.ContactWithUser;

import java.util.InputMismatchException;

public class Main {

    static ContactWithUser cwu = new ContactWithUser();

    public static void main(String[] args) {

        Option option = null;
        do{
            showOptions();
            option = getOption();
            switch(option){
                case SQUARE:
                    Square square = new Square(cwu);
                    square.draw();
                    break;
                case RECTANGULAR:
                    Rectangular rectangular = new Rectangular(cwu);
                    rectangular.draw();
                    break;
                case TREE:
                    Tree tree = new Tree(cwu);
                    tree.draw();
                    break;
                case EXIT:
                    cwu.printOut("Do zobaczenia!\n");
                    break;
            }
        } while (option !=Option.EXIT);

    }

    public static Option getOption(){
        Option opt = null;
        boolean isOk = true;
        do{
            try{
                int option = cwu.gotNumber();
                opt = Option.createFromInt(option);
                isOk = false;
            } catch (NoSuchOptionException e){
                cwu.printOut(e.getMessage() + "\n");
            }
        } while (isOk);
        return opt;
    }

    public static void showOptions(){
        cwu.printOut("Wybierz jedną z dostępnych opcji: \n");
        for(Option opt : Option.values()) {
            cwu.printOut(opt.toString() + "\n");
        }
    }

    enum Option {
        SQUARE(0, "Narysuj kwadrat"),
        RECTANGULAR(1, "Narysuj prostokąt"),
        TREE(2, "Narysuj choinkę"),
        EXIT(3, "Wyjdź z programu");

        private int number;
        private String description;

        Option(int number, String description) {
            this.number = number;
            this.description = description;
        }

        static Option createFromInt(int option) throws NoSuchOptionException{
            try{
                return Option.values()[option];
            } catch (IndexOutOfBoundsException e){
                throw new NoSuchOptionException("Brak opcji o id " + option + " , spóbuj ponownie!");
            }

        }

        @Override
        public String toString() {
            return number + " - " + description;
        }
    }
}
