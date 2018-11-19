package g4g.string;

import java.util.Scanner;

public class ReverserStringWholeWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n = Integer.parseInt(nStr);
        for(int i=0;i<n;i++){
            String in = sc.nextLine();
            reverse(in,0);
            System.out.println();
        }

    }
    public static void reverse(String input,int s){
        StringBuilder word = new StringBuilder();
        for(int i=s;i<input.length();i++){
          Character c = input.charAt(i);
          if(c.charValue()=='.'){
              reverse(input,i+1);
              if(i>0){
                  System.out.print(".");
              }
              System.out.print(word);
              return;
          }else{
          word.append(c);
          }

        }
        System.out.print(word);
    }
}
