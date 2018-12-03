package g4g.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n = Integer.parseInt(nStr);
        List<String> arrayList = new ArrayList<>();
        for(int i=0;i<n;i++){
            String in = sc.nextLine();
            arrayList.add(in);
        }
        for(int i=0;i<n;i++){
            String in = arrayList.get(i);
            System.out.println(anagram(in.split(" ")[0],in.split(" ")[1]));
        }
    }
    public static String anagram(String input1, String input2){
        char[] array = input1.toCharArray();
        char[] array2 = input2.toCharArray();
        if(array.length != array.length){
            return "NO";
        }
        for(int i=0;i<array.length;i++){
            if(array[i]!=array2[i]){
                return "NO";
            }
        }
        return "YES";
    }
}
