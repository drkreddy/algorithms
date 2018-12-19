package g4g.lnkdList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Middle {
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
            System.out.println(middle(next));
        }
    }

    private static int middle(Node input) {

        Node one=input;
        Node two=input;
        while(two.next!=null){
            if(two.next.next!=null){
                two=two.next.next;
                one=one.next;
            }else{
                return one.next.data;
            }
        }
        return one.data;
    }

}

class Node{
    int data;

    public Node(int element, Node next) {
        this.data = element;
        this.next = next;
    }

    Node next;
}
