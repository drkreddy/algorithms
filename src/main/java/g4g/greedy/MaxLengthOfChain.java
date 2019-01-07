package g4g.greedy;

import javafx.util.Pair;

import java.util.*;

public class MaxLengthOfChain {
   static class Link implements Comparable<Link> {
        Integer left;
        Integer right;

        public Link(Integer left, Integer right) {
            this.left = left;
            this.right = right;
        }

        public Integer getLeft() {
            return left;
        }

        public void setLeft(Integer left) {
            this.left = left;
        }

        public Integer getRight() {
            return right;
        }

        public void setRight(Integer right) {
            this.right = right;
        }

        @Override
        public int compareTo(Link o) {
            return this.right-o.right;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            Link [] links=new Link[n];
            List<Link> list = new ArrayList();
            for(int j=0;j<n;j++){
                links[j]=new Link(sc.nextInt(),sc.nextInt());
                list.add(links[j]);
            }

           Collections.sort(list);

            int result=1;
            int prev=list.get(0).getRight();
            for(int k=1;k<n;k++){
                if(list.get(k).getLeft()>prev){
                    result++;
                    prev=list.get(k).getRight();
                }
            }
            System.out.println(result);

        }
    }

    public static class comparator implements Comparator<Pair<Integer,Integer>>{

        @Override
        public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {

            return o1.getValue()-o2.getValue();
        }
    }

}
