import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pat1009 {

    public static void main(String[] args) throws IOException {

//            Scanner in = new Scanner(System.in);
//            String str = in.nextLine();
//            String[] arr = str.split(" ");
//            for(int i=arr.length-1;i>0;i--) {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.print(arr[0]);
            Scanner in =new Scanner(System.in);
            String str=in.nextLine();
            String[] arr=str.split(" ");
            for (int i=arr.length;i>0;i--){
                System.out.print(arr[i]+" ");
            }


    }
}
