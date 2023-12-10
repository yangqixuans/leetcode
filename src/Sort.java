import java.util.Arrays;

public class Sort {
    public void Selection(int[] a){
        int num=a.length;
        for (int i=0;i<num-1;i++){
            int cho=a[i],re=i;
            for (int j=i;j<num;j++){
                if (a[j]<cho){
                    cho=a[j];re=j;
                }
            }

            if (a[re]<a[i]){
                int temp=a[i];
                a[i]=a[re];
                a[re]=temp;

            }
        }
        System.out.print(Arrays.toString(Arrays.stream(a).toArray()));
    }
    public void Insertion(int []a){
        int num=a.length;
        for (int i=1;i<num;i++){
            int temp=a[i],j=i;
            while (j>0&&temp<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        System.out.print(Arrays.toString(Arrays.stream(a).toArray()));
    }

    public static void main(String[] args) {
        Sort sort=new Sort();
        sort.Selection(new int[]{10, 5,6,8,9,5,4});
        sort.Insertion(new int[]{10, 5,6,8,9,5,4});
    }
}
