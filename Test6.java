package in.ganesh.test;

import java.util.Arrays;
import java.util.List;

import static in.ganesh.test.MergeTwoSortedLinkedLists.mergeTwoLLLists;

class ListNod{
    int val;
    ListNod next;
    ListNod(int val){
        this.val=val;
        this.next=null;
    }
}
class MergeTwoSortedLinkedLists {
    public static ListNod mergeTwoLLLists(ListNod l1,ListNod l2){

        ListNod dummy=new ListNod(0);
        ListNod temp = dummy;
        while ( l1!=null && l2!=null ){
            if ( l1.val<=l2.val ){
                temp.next=l1;
                l1=l1.next;
            }else {
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if ( l1!=null ){
            temp.next=l1;
        }else {
            temp.next=l2;
        }

        return dummy.next;
    }
}



public class Test6 {
    public static void main(String[] args) {
        ListNod listNod1 = new ListNod(1);
        listNod1.next=new ListNod(3);
        listNod1.next.next=new ListNod(5);
        ListNod listNod2 = new ListNod(2);
        listNod2.next=new ListNod(4);
        listNod2.next.next=new ListNod(6);
        ListNod merged = mergeTwoLLLists(listNod1, listNod2);
        System.out.println("after merged list :: ");
        printListTest(merged);
    }

    private static void printListTest(ListNod head) {
        while ( head!=null ){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
}
