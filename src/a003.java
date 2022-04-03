/* ***************************************** */
/*  Problem: a003: 兩光法師占卜術              */
/*  Language: JAVA                           */
/*  Result: AC (0.2s, 2MB) on ZeroJudge      */
/*  Author:陳科融 2022-04-02  */
/* ***************************************** */
import java.util.Scanner;
public class a003 {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int M;//月
        int D;//日
        while(cin.hasNextInt()){
            M=cin.nextInt();
            D=cin.nextInt();
            int S=(M*2+D)%3;
            switch(S){
                case 0:
                    System.out.println("普通");
                    break;
                case 1:
                    System.out.println("吉");
                    break;
                case 2:
                    System.out.println("大吉");
                    break;
            }
        }
    }
}
