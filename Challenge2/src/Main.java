import java.text.BreakIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int x = 0 , y = 0 ;
    public static void goUp (){
        y++;
        System.out.println("Up");
    }
    public static void goDown (){
        y--;
        System.out.println("Down");
    }
    public static void goRight (){
        x++;
        System.out.println("Right");
    }
    public static void goLeft (){
        x--;
        System.out.println("Left");
    }
    public static void show(){
        if (x == 0 && y ==0){
            System.out.println("Le robot est revenu au point de départ");
        }else {
            System.out.println("(" + x + "," + y + ")");
        }
    }

    public static void programe(){
        int num = 0;
        do {
            System.out.println(" 1 : Up \n 2: Down \n 3: Right \n 4: Left \n 5: Show current position \n 6: Exit" );
            System.out.println("Entre a number: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            switch (num){
                case 1 :
                    goUp();
                    break;
                case 2 :
                    goDown();
                    break;
                case 3 :
                    goRight();
                    break;
                case 4 :
                    goLeft();
                    break;
                case 5 :
                    show();
                    break;
                default:
                    System.out.println("Invalid input try again");
                    programe();
            }
        }while (num != 6);
    }


    public static void main(String[] args) {
        try{
            programe();
        }catch (Exception err){
            System.out.println(err);
            programe();
        }
    }
}