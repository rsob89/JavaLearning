package interaction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactWithUser {

    Scanner scan = new Scanner(System.in);

    public void printOut(String text){
        System.out.print(text);
    }

    public int gotNumber(){
        boolean isOk = true;
        int a = 0;
        do{
            try{
                a = scan.nextInt();
                if(a >= 0){
                    isOk = false;
                } else {
                    printOut("Podana liczba musi być większa lub równa zero \n");
                }
            } catch (InputMismatchException e){
               printOut("Podaj liczbę! \n");
            } finally {
                scan.nextLine();
            }
        } while (isOk);
        return a;
    }

    public void scannerClose(){
        scan.close();
    }
}
