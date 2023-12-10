public class le003 {
    public int lengthOfLongestSubstring(String s) {
        //记录字符上一次出现的位置,last是一个ASCII码数组
        int[] last=new  int[128];
        for (int i=0;i<128;i++){
            last[i]=-1;
        }
        int n=s.length();
        int res=0;
        int start=0;//窗口开始的位置
        for (int i=0;i<n;i++){
            int index=s.charAt(i);

            start=Math.max(start,last[index]+1);
            res=Math.max(res,i-start+1);
            last[index]=i;
        }
        return res;
    }

    public static void main(String[] args) {
        le003 le003=new le003();
        int a=le003.lengthOfLongestSubstring("abcabcbb");
        System.out.println(a);
    }
}
