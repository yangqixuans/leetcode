import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;


public class pat001 {
    public static void main(String[] args) throws IOException {
        BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer r=new StreamTokenizer(re);
        r.nextToken();
        int a=0,num= (int) r.nval;
        if (num==0)
            return;
        while (num!=1){
            if (num%2==0){
                num/=2;
            }else{
                num=(3*num+1)/2;
            }
            a++;
        }


        System.out.println(a);
    }
}
