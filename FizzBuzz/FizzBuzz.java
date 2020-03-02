public class Main {

    public static void main(String[] args) {

        for(int i = 1 ; i < 101 ; i++){
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println(i + " - FizzBuzz");
            if(i % 3 == 0)
                System.out.println(i + " - Fizz");
            if(i % 5 == 0)
                System.out.println(i + " - Buzz");
        }
    }

}
