package g4g.lnkdList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort012LnkdLst {
    static Node left;

    static class Node {
        Node next;
        int value;

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numberOflines = bufferedReader.readLine();
        int na = Integer.parseInt(numberOflines);
        for (int inx = 0; inx < na; inx++) {

            String inp = bufferedReader.readLine();
            int[] inpArr = Arrays.stream(inp.split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
            Node next = null;
            for (int i = inpArr.length - 1; i > -1; i--) {
                next = new Node(inpArr[i], next);
            }
            left = next;
            print(sort(next));
        }
    }

    static void print(Node n) {
        Node c = n;
        while (c != null) {
            System.out.println(c.value);
            c = c.next;
        }
    }

    static Node sort(Node head) {
        Node first = null;
        Node firstOne=null;
        Node firstTwo=null;
        Node current = head;
        Node zero = null;
        Node one = null;
        Node two = null;
        Node parent=null;
        while (current != null) {
            if (current.value == 0) {
                if (first == null) {
                    first = current;
                    zero = current;
                }else {
                    zero.next=current;
                    zero=current;
                }
            }
            if (current.value == 1) {
                if (one == null) {
                    one=current;
                    firstOne=current;
                }else{
                    one.next=current;
                    one=current;
                }
            }
            if (current.value == 2) {
                if (two == null) {
                    two=current;
                    firstTwo=current;
                }else {
                    two.next=current;
                    two=current;
                }
            }

            current=current.next;


        }

        zero.next=firstOne;
        one.next=firstTwo;
        two.next=null;
        return first;


        // head->2->1->0->2->1->2->0->1->0->null
        //


    }
}

/*
* Other method is count number of zeros ones and two and set the values of nodes  accordingly in Linked list
 */
