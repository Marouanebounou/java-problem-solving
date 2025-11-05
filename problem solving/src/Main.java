//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.lang.constant.Constable;
import java.util.Scanner;

public class Main {

    public static void calcule(){
        Double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Entre the number of units consumed: ");
        float consumed = scanner.nextFloat();
        if (consumed <= 100){
            result = consumed * 0.8;
        }else if(consumed <= 200){
            result = ((consumed - 100) * 1.2) + 100 * 0.8;
        }else {
            result = ((consumed - 200) * 1.2) + (100 * 0.8) + (100 * 1.5);
        }
        System.out.println("Facture avant taxe : "+ result + " DH");
        System.out.println("Taxe (10%) : " + result/10 + " DH");
        System.out.println("Facture totale :" + (result + (result/10)));
    }


    public static void main(String[] args) {
        calcule();
    }
}