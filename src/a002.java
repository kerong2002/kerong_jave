/* ***************************************** */
/*  Problem: a002 簡易加法                     */
/*  Language: JAVA                           */
/*  Result: AC (0.2s, 1.9MB) on ZeroJudge    */
/*  Author:陳科融 2022-04-02  */
/* ***************************************** */
import java.util.Scanner;
public class a002 {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int a,b;
        while(cin.hasNextInt()){
            a=cin.nextInt();
            b=cin.nextInt();
            System.out.println(a+b);
        }
    }
}
