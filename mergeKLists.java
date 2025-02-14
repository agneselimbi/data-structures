import java.util.ArrayList;
import java.util.List;

public class mergeKLists {
    
    public ListNode mergeKList(ListNode[] lists) {
        if (lists == null || lists.length == 0){
            return null;
        }
        while (lists.length > 1){
            List<ListNode> mergedLists = new ArrayList<>();  
            for (int j =0; j< lists.length; j+=2){
                ListNode l = lists[j];
                ListNode r = (j+1)<lists.length ? lists[j+1]  : null;
                mergedLists.add(merge2Lists(l,r));  
            }
            lists = mergedLists.toArray(new ListNode[0]);
        }
        return lists[0];
    }
    public ListNode merge2Lists(ListNode left, ListNode right){
        ListNode res = new ListNode(); 
        ListNode head = res; 

        while(left != null && right != null){
            if (left.val < right.val){
                head.next = left;
                left = left.next;
            } else {
                head.next = right;
                right = right.next;        
            }
            head = head.next ;
        }
        if (right != null){
           head.next = right; 
        }
        if (left != null){        
            head.next = left; 
        }
        return res.next; 
    }

    

    public static void main(String[] args) {
       
       
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;
        l6.next = null;
        ListNode l7 = new ListNode(2);
        ListNode l8 = new ListNode(6);
        l7.next = l8;
        l8.next = null;
        ListNode[] lists = {l1,l4,l7};       
       /*
       ListNode l1 = new ListNode(2);
       ListNode l2 = new ListNode();
       ListNode l3 = new ListNode(-1);
       System.out.println("\n");
       ListNode[] lists = {l1,l2,l3};
      */
       
       mergeKLists solution = new mergeKLists();         
       ListNode res = solution.mergeKList(lists);
        while (res != null){
            System.out.println(res);
            res = res.next;
        }
        
        
     
        
        
    }
}