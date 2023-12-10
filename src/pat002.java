import java.io.*;

public class pat002 {

    public static void main(String[] args) throws IOException {
        BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer r=new StreamTokenizer(re);
        r.nextToken();
        int num =(int)r.nval;
        if (num==1){
            r.nextToken();
            int sch=(int)r.nval;

            r.nextToken();
            int gra=(int)r.nval;
            System.out.println(sch+" "+gra);
            return;
        }

        int[] grade =new int[num];
        while (0<num--){
            r.nextToken();
            int sch=(int)r.nval;

            r.nextToken();
            int gra=(int)r.nval;
            grade[sch]+=gra;

        }


        int ans1=-1;int ans2=0;
        for (int j=1;j<grade.length;j++){
            if (grade[j]>ans1){
                ans2=j;
                ans1=grade[j];
            }

        }
        System.out.println(ans2+" "+ans1);
    }
}
