import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class pat1022 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer read=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        read.nextToken();
        int a= (int) read.nval;read.nextToken();
        int b=(int)read.nval;read.nextToken();
        int c=(int)read.nval;
        int num=a+b;
        int[] ans=new int[31];int i=0;
        while (num>0){
            ans[i++]=num%c;
            num/=c;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(ans[j]);
        }




    }
}
