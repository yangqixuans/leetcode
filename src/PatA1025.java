import java.util.Scanner;
import java.util.*;
public class PatA1025 {
    static class Test implements Comparable<Test>{
        String id;
        int score;
        int rank;
        public Test(String id, int score) {
            this.id = id;
            this.score = score;
        }

        @Override
        public int compareTo(Test t2) {
            if(score > t2.score)	return -1;
            if(score < t2.score) return 1;
            if(id.compareTo(t2.id) > 0) return 1;
            if(t2.id.compareTo(id) > 0) return -1;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // or user Arrays
        ArrayList<ArrayList<Test>> list = new ArrayList<ArrayList<Test>>();
        int sum = 0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            ArrayList<Test> ts = new ArrayList<Test>();
            int m = sc.nextInt();
            sum += m;
            for(int j=0; j<m; j++) {
                String a=sc.next();
                int b=sc.nextInt();
                ts.add(new Test(a,b));
            }

            Collections.sort(ts);
            int pre_score = -1, pre_rank = 1;
            for(int k=0; k<ts.size(); k++) {
                Test t  = ts.get(k);
                if(pre_score != t.score) {
                    pre_rank = 1 + k;
                    pre_score = t.score;
                    t.rank = k + 1;
                } else {
                    t.rank = pre_rank;
                }
            }
            list.add(ts);
        }

        System.out.println(sum);
        int[] pos = new int[n];
        Test[] merge = new Test[n];
        for(int i=0; i<n; i++)
            merge[i] = list.get(i).get(0);

        int pre_score = -1, pre_rank = 1;
        for(int i=0; i<sum; i++) {

            // find max
            Test max = null;
            int maxid = -1;
            for(int j=0; j<n; j++) {
                if(merge[j] != null) {
                    if(max == null) {
                        max = merge[j];
                        maxid = j;
                    } else if(merge[j].compareTo(max) < 0) {
                        max = merge[j];
                        maxid = j;
                    }
                }
            }

            if(pre_score != max.score) {
                System.out.println(max.id + " " + (1+i) + " " + (1+maxid) + " " + max.rank);
                pre_rank = 1 + i;
                pre_score = max.score;
            }
            else
                System.out.println(max.id + " " + pre_rank + " " + (1+maxid) + " " + max.rank);


            ++pos[maxid];
            if(pos[maxid] >= list.get(maxid).size())
                merge[maxid] = null;
            else
                merge[maxid] = list.get(maxid).get(pos[maxid]);
        }

    }


}

