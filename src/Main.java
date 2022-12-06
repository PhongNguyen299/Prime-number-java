import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Enter Number");
       int num = inputN();
       int count = 0;
       for (int i = 2; count <= num; i++){
           if(isPrimeNumber(i)){
               System.out.print(i + " ");
               count++;
           }
       }
    };

    public static int inputN(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public static boolean isPrimeNumber(int n){
       if (n < 2) return false;
       else {
           for (int i = 2; i <= Math.sqrt(n); i++){
               if (n % i == 0) return false;
           }
       }
       return true;
    };
}