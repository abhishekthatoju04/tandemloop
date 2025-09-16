import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();        
        if (a <= 0) {              
            System.out.println("this program doesn't accept negative numbers");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            if (i > 0){
                sb.append(", ");
            }
            sb.append(2 * i + 1); 
        }
        System.out.println(sb.toString());
    }
}
