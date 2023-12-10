import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class pat1036 {

    public static void main(String[] args) throws IOException {
//        StreamTokenizer read=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//        read.nextToken();
//        read.ordinaryChars('0', '9') ;
//        read.wordChars('0', '9');
        Scanner read=new Scanner(System.in);

        int horizon= (int) read.nextInt();
        int vert=(horizon+1)/2;
//        read.nextToken();
        String s= read.next();
        System.out.println("------"+s);
        for (int i=0;i<vert;i++){
            if (i==0||i==vert-1){
                for (int j=0;j<horizon;j++){
                    System.out.print(s);
                }
            }else {
                for (int j=0;j<horizon;j++){
                    if (j==0||j==horizon-1){
                        System.out.print(s);
                    }else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.print("\n");
        }
    }
}
