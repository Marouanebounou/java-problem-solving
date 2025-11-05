import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre number of the students: ");
        int N = scanner.nextInt();
        System.out.print("Entre number of the Benches: ");
        int M = scanner.nextInt();
        int i = 1;
        for (int y = 1 ; y <= M ; y++){
            System.out.println("Bench "+y+": Student "+i+", Student"+(i+1));
            i+=2;
            N-=2;
        }
        if (N != 0){
            System.out.println(N + " Students cannot find a seat");
        }
    }
 }