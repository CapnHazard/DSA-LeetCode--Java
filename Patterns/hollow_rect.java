import java.util.*;
public class hollow_rect {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        p.close();
        int n = p.nextInt();
        int m = p.nextInt(); 
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i==0 || i==(n-1) || j==0 || j==(m-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
