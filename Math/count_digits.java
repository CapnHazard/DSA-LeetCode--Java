//BETTER SOLUTION WITH TIME COMPLEXITY = O(1)
import java.util.*;
public class count_digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = (int) Math.log10(n) + 1;
        System.out.println(n + " has "+ count +" digits.");
        sc.close();
    }
}



/*   OLD APPROACH USED, TIME COMPLEXITY = O(log10(n))
import java.util.*;
public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int copy_num = n;
        while(copy_num!=0){
            copy_num = copy_num/10;
            count++;
        }
        System.out.println(n + " has "+ count +" digits.");
        sc.close();
    }

}
*/