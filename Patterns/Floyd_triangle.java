import java.util.*;

public class Floyd_triangle {
    public static void main(String[] args){
        System.out.print("Enter input: ");
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a++ +" ");
            }
            System.out.println(" ");
        }
}
}