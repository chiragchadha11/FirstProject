import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int i = 0;
//        while (true){
//            if (i < 10) {
//                System.out.println(i);
//                i++;
//
//            }else {
//                break;
//            }
//        }
//    }


int e = (int)(Math.random()*100);
              //System.out.println(e);
        int counter = 0;
          System.out.println("type a number between 0 - 99");
        Scanner sc = new Scanner(System.in);
        while(counter!=5){
          int guess = sc.nextInt();
                if (e==guess){
            System.out.println("You Won!, you guess the right no.");
          break;
        }else {
          System.out.println("Sorry, try again");
              counter++;
                }
            }
        }
}

