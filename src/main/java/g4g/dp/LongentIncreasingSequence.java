package g4g.dp;

public class LongentIncreasingSequence {
    public static void main(String[] args) {
     int[] input = new int[]{ 34, 22, 9, 33, 21, 50, 71, 60 };
     lis(input);
    }

    private static void lis(int[] input) {
        int n=input.length;
        int max=1;

        int[] lis= new int[n];
        for(int i=0;i<n;i++){
            lis[i]=1;
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(input[i]> input[j] && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                    if(lis[i]>max){
                        max=lis[i];
                    }
                }
            }
        }

        System.out.println(max);



    }

}
