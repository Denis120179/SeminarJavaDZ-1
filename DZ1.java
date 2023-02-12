import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your number N: ");
        int a = in.nextInt();
        //in.close();
        System.out.println("Triangular Number = " + TriNum(a) + "\n");
        in.close();
    }

    public static int TriNum(int n) {
        if (n == 1) {
            return 1;
        }
        return (n * (n + 1)) / 2;
    }
}