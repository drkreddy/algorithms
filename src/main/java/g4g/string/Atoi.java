package g4g.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atoi {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numberOflines = bufferedReader.readLine();
        int na = Integer.parseInt(numberOflines);
        for(int inx = 0;inx<na;inx++) {
            String inp = bufferedReader.readLine();
            System.out.println(find(inp));
        }
    }

    private static int find(String input) {
        int sum=0;
        int n=input.length()-1;
        int pow=1;
        for(int index=input.length()-1;index>=0;index--){
            Character c = input.charAt(index);
            if('0'<=c && c<='9'){
                int i=c-48;
                sum=sum+(int)Math.pow(10,n-index)*i;
            }else{
                return -1;
            }
        }
        return sum;
    }
}
