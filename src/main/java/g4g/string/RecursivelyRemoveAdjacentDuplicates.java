package g4g.string;

import java.util.Scanner;

public class RecursivelyRemoveAdjacentDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n = Integer.parseInt(nStr);
        for(int i=0;i<n;i++){
            String in = sc.nextLine();
            RecursivelyRemoveAdjacentDuplicates(in,0);
        }
    }
    //acaaabbbacdddd

    public static void RecursivelyRemoveAdjacentDuplicates(String input,int index){

            if(index>0 && index< input.length()-1 && (input.charAt(index)==input.charAt(index-1) ||
                    input.charAt(index)==input.charAt(index+1))){

            }else if(index==0  && index+1 < input.length() && input.charAt(index)==input.charAt(index+1)){


            }else if(index==input.length()-1  && index-1>=0 && input.charAt(index)==input.charAt(index-1)){
                return;
            }else {
                System.out.print(input.charAt(index));
            }
            if(index<input.length()-1) {
                RecursivelyRemoveAdjacentDuplicates(input, index + 1);
            }
        }

}
