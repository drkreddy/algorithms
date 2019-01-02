package g4g.greedy;

import java.util.Scanner;

public class LargestPossibleNumber
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int noDigits= sc.nextInt();
            int sum=sc.nextInt();
            System.out.println(number(noDigits,sum));

        }


    }

    private static String number(int noDigits, int sum) {
        int i=9;
        int power=0;
        String number="";
        if(sum==0){
            return "-1";
        }

        while(noDigits>0){
            if(sum>9){
                i=9;

            }else if(sum==0){
                i=0;
            } else{
                i=sum;
            }
            sum=sum-i;
            number=number+i;
            power++;
            noDigits--;

        }

        if(sum>0){
            return  "-1";
        }
        return number;
    }
}