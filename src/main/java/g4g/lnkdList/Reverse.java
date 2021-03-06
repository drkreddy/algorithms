package g4g.lnkdList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Reverse {
    static class Node {
        int value;
        Node next;
        Node(int value,Node next) {
            this.value = value;
            this.next=next;
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
                next = new Reverse.Node(inpArr[i],next);
            }
           Node n= reverse(next);
            print(n);
        }
    }


    static void print(Node n) {
        Node c=n;
        while(c!=null){
            System.out.println(c.value);
            c=c.next;
        }
    }

    private static Node reverse(Node node) {
      return  myreverse(node,null);

    }
    private static Node myreverse(Node node, Node parent){

        if(node==null){
            return parent;
        }else{
        Node head=myreverse(node.next,node);
            node.next=parent;
            return head;
        }
    }
}
//a->b->c->d->e
