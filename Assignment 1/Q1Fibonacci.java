import java.io.*;
import java.util.*;

public class Fibonacci{

    public static void main(String[] args) {
        int n=10, firstNum=0,secondNum=1,sum=0;
        int Nextnum;

       for( int i=1;i<=n;i++){
        System.out.print(firstNum + " ");
        sum+=firstNum;
        Nextnum=firstNum + secondNum;
        firstNum = secondNum;
        secondNum = Nextnum;

       }
       System.out.println("\n sum of series:" + sum);
 
    }
    
}
