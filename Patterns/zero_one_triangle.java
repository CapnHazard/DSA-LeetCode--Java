import java.util.Scanner;

public class zero_one_triangle {
    public static void main(String[] args){
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else if((i+j)%2!=0){
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }
}
