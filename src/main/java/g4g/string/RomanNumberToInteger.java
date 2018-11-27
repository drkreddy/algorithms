package g4g.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumberToInteger {
    static Map<Character,Integer> map = new HashMap(){
        {
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }
    };
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n = Integer.parseInt(nStr);
        for(int i=0;i<n;i++){
            String in = sc.nextLine();
            System.out.println(toRoman(in));
        }
    }
    public static int toRoman(String str){
        int sum=0;
        int pevious=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            Integer val = map.get(c);
            sum+=val;
            if(i>0){
                if(pevious<val){
                    sum=sum-2*pevious;
                }
            }
            pevious=val;
        }
        return sum;
    }

}
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */