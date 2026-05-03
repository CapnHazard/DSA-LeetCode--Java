import java.util.*;
public class inv_half_num_pyr {
    public static void main(String[] args){
        System.out.print("Enter input: ");
        Scanner s = new Scanner(System.in);
        s.close();
        int n = s.nextInt();
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
