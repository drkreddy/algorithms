package g4g.lnkdList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class reverseInGroup {
    static class Node {
        int value;
        Node next;
        Node(int value,Node next) {
            this.value = value;
            this.next=next;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numberOflines = bufferedReader.readLine();
        int na = Integer.parseInt(numberOflines);
        for(int inx = 0;inx<na;inx++) {
            String kstr = bufferedReader.readLine();

            String inp = bufferedReader.readLine();
            int[] inpArr = Arrays.stream(inp.split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
            Node next = null;
            for (int i = inpArr.length - 1; i > -1; i--) {
                next = new Node(inpArr[i], next);
            }
            Node h= reverse(next,Integer.parseInt(kstr));
            print(h);
        }

    }


    static void print(Node n) {
        Node c=n;
        while(c!=null){
            System.out.println(c.value);
            c=c.next;
        }
    }

   static Node reverse(Node n,int k){
        Node h=n;
        Node prev =null;
        int count =1;
        Node c=n;
        Node parent=null;
        Node first=null;
        while(c!=null){
            if((count)%(k+1)==0){
                if(first==null){
                    first=prev;
                }
                h.next=c;
                h=c;
                prev=c;
                c=c.next;
                count++;
                continue;
            }
            Node next = c.next;
            c.next=prev;
            prev = c;
            c=next;

            count++;
        }

    return first;
    }

}
// a b c d e f g h
//1 2 3 4 5 6
//1<2<-3 4
//h    pr  c