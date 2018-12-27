package g4g.lnkdList;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CheckLLisPalindrome {
    static Node left;
    static class Node{
        Node next;
        int value;

        public Node( int value,Node next) {
            this.next = next;
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numberOflines = bufferedReader.readLine();
        int na = Integer.parseInt(numberOflines);
        for(int inx = 0;inx<na;inx++) {

            String inp = bufferedReader.readLine();
            int[] inpArr = Arrays.stream(inp.split(" ")).mapToInt(x->Integer.parseInt(x)).toArray();
            Node next=null;
            for(int i=inpArr.length-1;i>-1;i--){
                next = new Node(inpArr[i],next);
            }
            left=next;
            System.out.println(isPlindrome(next));
        }
    }

    static boolean isPlindrome(Node right){
        if(right==null){
            return true;
        }
        boolean innerresult=isPlindrome(right.next);
        if(innerresult==false){
            return false;
        }
        boolean result=left.value==right.value?true:false;
        left=left.next;

        return result;
    }


    // 1 2 3 4 3 2 1
}
