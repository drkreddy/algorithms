package g4g.dp;

public class BoxStacking {
    public static void main(String[] args) {

        System.out.println(maxHeight(new int[]{1, 2, 3},
                new int[]{  4, 5,6 },
                new int[]{3, 4,1},
                3));
//        System.out.println(maxHeight(new int[]{4, 6, 7, 1},
//                new int[]{ 2, 3, 4, 5 },
//                new int[]{6,10, 12, 32},
//                4));
    }

    public static int maxHeight(int height[], int width[], int length[], int n){
        return maxHeighthelper(height,width,length,n,0);
    }

    public static int maxHeighthelper(int height[], int width[], int length[], int n,int base)
    {
        // your code here
        if(n==0){
            return 0;
        }
        int h=height[n-1];
        int w=width[n-1];
        int l=length[n-1];

        int hSum=0,wSum=0,lSum=0;
        if(w*l>base){
            hSum=h+maxHeighthelper(height,width,length,n-1,w*l);
        }else {
            hSum=0;
        }
        if(h*l>base){
            wSum=w+maxHeighthelper(height,width,length,n-1,h*l);
        }else {
            wSum=0;
        }
        if(h*w>base){
            lSum=l+maxHeighthelper(height,width,length,n-1,h*w);
        }else {
            lSum=0;
        }
        return Math.max(hSum,Math.max(lSum,wSum));
    }
}
