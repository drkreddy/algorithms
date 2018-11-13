import com.sun.deploy.util.ArrayUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Arrays {

    @Test
  public void equilibrium(){
        Assert.assertTrue(2==2);
        int[] a = new int[]{1,1,2,1,2,4};
        int i=0,j=a.length-1;
        while(i+1<j){
            if(a[i] == a[j]){
                i++;
                j--;
                break;
            }
            if(a[i]<a[j]){
                a[j]=a[j]-a[i];
                i++;
            }else{
                a[i]=a[i]-a[j];
                j--;
            }
        }

        if(a[i]==a[j]){
            System.out.println(a[(i+j)/2]);
        }else{
            System.out.println(-1);
        }
  }

     @Test
    public void maxSumOfNonDecreasingConsequitiveSubSequence() {
        int[] a = new int[] {1, 101, 2, 3, 100, 4};
        int maxSum = a[0];
        int currentSum = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] > a[i-1]){
                currentSum = currentSum+a[i];
            }else{
                currentSum = a[i];
            }

            if(maxSum<currentSum){
                maxSum = currentSum;
            }
        }
        System.out.println("maxSumOfNonDecreasingSubSequence is :" + maxSum);
    }

    //Dynamic Programming
    @Test
    public void maxSumOfNonDecreasingOrderedSubSequence() {
        int[] a = new int[] {1, 101, 2, 4, 100, 5};
        int [] sum = new int[a.length];
        int maxSum = 0;
        //initialize the array sum.
        for(int i=0;i<a.length;i++){
            sum[i] = i;
        }

        for(int i=1; i< a.length; i++){
            for(int j=0; j<i; j++){
                if(a[j] < a[i] && sum[i] < a[i]+sum[j]){
                    sum[i] = sum[j] + a[i];
                    System.out.println(sum[i]);
                }
            }
            if(maxSum < sum[i]){
                maxSum = sum[i];
            }
        }
        System.out.println("maxSumOfNonDecreasingSubSequence is :" + maxSum);
    }

    //Leader
    @Test
    public void leaderInArray() {
//        int[] a = new int[]{16, 17, 4, 3, 5, 2};
        //7 4 5 7 3
        int[] a = new int[]{7, 4, 5, 7, 3};
        int localMax = a[a.length - 1];
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] >= localMax) {
                localMax = a[i];
                System.out.print(a[i] + " ");
            }
        }
    }
    //https://practice.geeksforgeeks.org/problems/minimum-platforms/0
    @Test
    public void MinimumPlatforms() {
//        int[] a = new int[]{16, 17, 4, 3, 5, 2};
        //7 4 5 7 3
        int[] start = new int[]{900,  940, 950,  1100, 1500, 1800};
        int[] end = new int[]{910, 1200, 1120, 1130, 1900, 2000};

        int parllelStart = start[0];
        int parllelEnd = end[0];
        for(int i = 1; i<start.length; ){
            for(int j=1;j<end.length; ){
              
            }
        }

    }

    @Test
    public void PrintSpiralArray(){
        int[][] array= new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=4,m=4;
        for(int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(array[i][j]+"-");
            }
            System.out.println();
        }

        int t=0, b=n-1, l=0, r=m-1,d=0;
        while(t<=b && l<=r){
            if(d==0){
                for(int i=l;i<=r;i++){
                    System.out.print(array[t][i]+"->");
                }
                t++;d=1;
            }else if(d==1){
                for(int i=t;i<=b;i++){
                    System.out.print(array[i][r]+"->");
                }
                r--;d=2;
            }else if(d==2){
                for (int i=r;i>=l;i--){
                    System.out.print(array[b][i]+"->");
                }
                b--;d=3;
            }else if(d==3){
                for (int i=b;i>=t;i--){
                    System.out.print(array[i][l]+"->");
                }
                l++;d=0;
            }
        }
    }

    @Test
    public void MinimumPlatformsRequired(){

        int[] start = {900,  940, 950,  1210, 1350, 1800};
        int[] end   = {910, 1200, 1120, 1430, 1900, 2000};
        java.util.Arrays.sort(start);
        java.util.Arrays.sort(end);
        int minPlatforms=0;
        int max=0;

        for(int i=0,j=0;i<start.length && j<end.length;){
            if(start[i]<end[j]){
                minPlatforms++;
                i++;
            }else{
                minPlatforms--;
                j++;
            }
            if(minPlatforms>max){
                max=minPlatforms;
            }
        }

        System.out.println(max);
    }

    @Test
    public void TrapRaininBars(){
        int[] bars = {2, 1, 0, 4, 0, 3};
        int[] stack = new int[6];
        int index= bars[0];
        int[] leftMax = new int[6];
        int[] rightMax = new int[6];
        leftMax[0] = bars[0];
        for(int i=1;i<bars.length;i++){
            if(leftMax[i-1]>bars[i]){
                leftMax[i]=leftMax[i-1];
            }else{
                leftMax[i]=bars[i];
            }
        }
        rightMax[5] = bars[5];
        for(int i=bars.length-2;i>=0;i--){
            if(rightMax[i+1]>bars[i]){
                rightMax[i]=rightMax[i+1];
            }else{
                rightMax[i]=bars[i];
            }
        }

        for (int i=0;i<bars.length;i++){
            System.out.print("-"+leftMax[i]);
        }
        System.out.println("");
        for (int i=0;i<bars.length;i++){
            System.out.print("-"+rightMax[i]);
        }

        int sum=0;
        for(int i=0;i<bars.length;i++){
            int height = Math.min(leftMax[i], rightMax[i]);
            sum=sum+height-bars[i];
        }
        System.out.println("Total Water collected is "+sum);
    }


    @Test
    public void Heapify(){

      int[] a = {1, 3, 4, 8, 19, 22, 29};
      for(int i=(a.length/2)-1;i>=0;i--){
          Sorts.heapify(a,7,i);
      }
      for (int k=0;k<a.length;k++)
        System.out.print(a[k]+"-");
    }

    public void swap(int[] a,int i, int j){
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void heapify(int[] a,int k){

        for(int i=0;i<k;i++){

        }
    }

    public static void main() {
        int[] input = {12, 10, 2, 9, 23, 34, 17};
        List<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("DEC");
        list.add("GHI");
        list.stream().anyMatch(x -> x.equals("ABC"));
        int size = input.length;
    }

    @Test
    public void stockBuySell(){
//      int[] price= {100, 180, 260, 310, 40, 535, 695};
     int[] price= {23, 13, 19, 29,4,2, 33, 19, 34, 45, 65,67};
      int buy_day,sell_day;

       buy_day=0;
       sell_day=0;
       int current_buy=price[0];

       for(int i=1;i<price.length;i++){
           if(current_buy > price[i]){
               if(sell_day!=buy_day){
                   System.out.println("{"+buy_day+", "+sell_day+"}");
               }
               buy_day=i;
               sell_day=i;
               current_buy=price[i];
           }else{
               current_buy=price[i];
               sell_day=i;
           }
       }

        System.out.println("{"+buy_day+", "+sell_day+"}");



    }

    @Test
    public void leftSmallerAndRightGreater(){
        int[] input={4, 3,2, 7, 8, 9};
//        int[] input={11, 9, 12};
//        int[] input={4, 2, 5, 7};
        int[] min = new int[input.length];
        int[] max = new int[input.length];

        int tempmax=input[0];
        max[0] = tempmax;
        for(int i=1;i<input.length;i++){
            if(input[i]>tempmax){
                tempmax=input[i];
            }
            max[i]=tempmax;
        }

        int tempmin = input[input.length-1];
        min[0] = tempmin;
        for(int i=input.length-2;i>=0;i--){
            if(input[i]<tempmin){
                tempmin=input[i];
            }
            min[i]=tempmin;
        }

        int output=-1;
        for(int i=0;i<input.length;i++){

            if(input[i]>=max[i] && input[i]<=min[i]){
                output=input[i];
                break;
            }

        }
        System.out.println("Element is "+output);
    }

    @Test
    public void zigZagg(){
        int[] input = {1, 4, 3, 2};
//        int[] input = {4, 3, 7, 8, 6, 2, 1};

        for(int i=0;i<input.length-1;i++){
            if(i%2==0){
                if(input[i]>input[i+1]){
                    swap(input,i,i+1);
                }
            }else{
                if(input[i]<input[i+1]){
                    swap(input,i,i+1);
                }
            }
        }

        for (int i=0;i<input.length;i++){
            System.out.print(input[i]+"-");
        }
    }


    @Test
    public void findNonRepeatedinArray(){
        int[] input = {1, 1, 2, 2, 3, 4, 4, 50, 50, 65, 65};
        int x=0;
        for(int i=0;i<input.length;i++){
            x=x^input[i];
        }
        System.out.println(x);
    }

    @Test
    public void test(){
        List<String> abc=new ArrayList<>();
        System.out.println(abc);
    }
}