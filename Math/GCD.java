//Below solution uses EUCLIDEAN ALGORITHM find GCD of two numbers
import java.util.*;
public class GCD{
    public void findGCD(int a, int b){
        //euclidean logic
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            } else {
                b = b % a;
            } 
        }
        if(a==0){
            System.out.println("GCD is " + b);
        } else {
            System.out.println("GCD is " + a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        GCD obj = new GCD();
        obj.findGCD(a, b);
        sc.close();
    }
}
/*
import java.util.*;
public class GCD{
    public void findGCD(int x, int y){
        int Xfactors [] = new int [10000];
        int Yfactors [] = new int [10000];
        int CommonFactors [] = new int [10000];
        int size = 0;
        int Xsize = 0;
        int Ysize = 0;
        for(int i=0; i<x; i++){
            if(x%(1+i) == 0){
                Xfactors[Xsize] = i+1;
                Xsize++;
            }
        }
        System.out.println("Xsize is- "+Xsize);

        for(int i=0; i<y; i++){
            if(y%(i+1) == 0){
                Yfactors[Ysize] = i+1;
                Ysize++;
            }
        }
        System.out.println("Ysize is- "+Ysize);

        for(int i=0; i<Xsize; i++){
            for(int j=0; j<Ysize; j++){
                if(Xfactors[i] == Yfactors[j]){
                CommonFactors[size] = Xfactors[i];
                size = size + 1;
            }
            }
        }
        int a = CommonFactors[0];
        //int gcd = 0;
        for(int i=0; i<size; i++){
            if(a<CommonFactors[i]){
                a = CommonFactors[i];
            } 
            System.out.println(CommonFactors[i]);
        }
        System.out.println("GCD is " + a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        GCD obj = new GCD();
        obj.findGCD(x, y);
        sc.close();
    }
}
*/