
public class le002 {
    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
          int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            //如果都为空 直接返回不为空的一个参数 如果都未空 则返回空
//            if(l1 == null || l2 == null){
//                return l1 == null ?(l2 == null ?null:l2):l1;
//            }
//        int a=0,b = 0,c=0,d=0,i=0;
//        ListNode N1,N2=new ListNode();
//        N1=l1;
//        while (N1!=null){
//            i++;
//            N1=N1.next;
//        }
//        N1=l1;
//        for (int j=0;j<i;j++){
//            a+= (int) (N1.val*Math.pow(10,j));
//            N1=N1.next;
//        }
//        N2=l2;i=0;
//        while (N2!=null){
//            i++;
//            N2=N2.next;
//        }
//        N2=l2;
//        for (int j=0;j<i;j++){
//            b+= (int) (N2.val*Math.pow(10,j));
//            N2=N2.next;
//        }
//        c=a+b;d=i-1;
//        String num= String.valueOf(c);
//        i=num.length();
//        ListNode l3=new ListNode();
//        ListNode N3=new ListNode();
//        N3=l3;l3.val= (int) (c/Math.pow(10,d)%10);d--;
//        for (int j=1;j<i;j++){
//            ListNode listNode=new ListNode();
//            listNode.val=(int) (c/Math.pow(10,d)%10);d--;
//            N3.next=listNode;N3=listNode;
//
//        }
//        return l3;
//    }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int total,num1,num2;
        num1=l1==null ? 0 :l1.val;num2=l2==null ? 0 : l2.val;
        total=num1+num2;
        ListNode l3=new ListNode(total%10);total/=10;
        ListNode node=new ListNode();
        node=l3;

        while (l1.next!=null||l2.next!=null||total!=0){
            num1=l1.next==null ?  0 :l1.next.val;num2=l2.next==null ? 0  : l2.next.val;
            total+=num1+num2;

            ListNode news=new ListNode(total%10);total/=10;
            node.next=news;
            node=news;

            if (l1.next!=null){
                l1=l1.next;
            }
            if (l2.next!=null){
                l2=l2.next;
            }

        }
        return l3;
    }
}
}
