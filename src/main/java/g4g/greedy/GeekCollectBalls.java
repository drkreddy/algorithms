package g4g.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GeekCollectBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] N =new int[n];
            int[] M = new int[m];
            for(int j=0;j<n;j++){
                N[j]=sc.nextInt();
            }
            for(int j=0;j<m;j++){
                M[j]=sc.nextInt();
            }


            int r=0;
            int s=0;
            int one=0;
            int two=0;
            int ans=0;

            while(r<n && s<m){

                if(N[r]<M[s]){
                    one+=N[r];
                    r++;
                }else if(N[r]> M[s]){
                    two+=M[s];
                    s++;
                }else{

                    int max=one<two?two:one;

                    one=max+N[r];
                    two=max+M[s];
                    ans+=Math.max(one,two);
                    r++;
                    s++;

                    one=two=0;
                }
            }

            if(N[r-1]==M[s-1]){
                ans+=Math.max(one,two) ;}

            if(r<n){
                for(int k=r;k<n;k++){
                    one+=N[r];
                }
            }

            if(s<m){
                for(int k=s;k<m;k++){
                    two+=M[s];
                }
            }

           System.out.println( ans+Math.max(one,two));

        }
    }
}



/*
   int main() {
	//code
	int t;
	cin>>t;
	while(t--)
	{
	    int n,m;
	    cin>>n>>m;
	    vector<int> a(n),b(m);
	    for(int i=0;i<n;i++)
	    cin>>a[i];
	    for(int i=0;i<m;i++)
	    cin>>b[i];
	    int p1=0,p2=0,ans=0;
	    int i=0,j=0;
	    while(i<n&&j<m)
	    {
	        if(a[i]<b[j])
	        {
	            p1+=a[i++];
	        }
	        else if(b[j]<a[i])
	        {
	            p2+=b[j++];
	        }
	        else
	        {
	            p1+=a[i++];
	            p2+=b[j++];
	            ans+=max(p1,p2);
	            p1=0,p2=0;
	        }
	    }
	    if(a[i-1]==b[j-1])
	    {
	        ans+=max(p1,p2);
	    }
	    while(i<n)
	    {
	        p1+=a[i++];
	    }
	    while(j<m)
	    {
	        p2+=b[j++];
	    }
	    ans=ans+max(p1,p2);
	    cout<<ans<<endl;

	}
	return 0;
}

*/