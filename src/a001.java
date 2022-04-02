/* ***************************************** */
/*  Problem: a001. 哈囉                       */
/*  Language: JAVA                           */
/*  Result: AC (0.2s, 1.9MB) on ZeroJudge    */
/*  Author: 陳科融 2022-04-01  */
/* ***************************************** */
import java.util.Scanner;
public class a001 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String s;
        while(cin.hasNext()){
            s=cin.nextLine();
            System.out.println("hello, "+s);
        }
    }
}
