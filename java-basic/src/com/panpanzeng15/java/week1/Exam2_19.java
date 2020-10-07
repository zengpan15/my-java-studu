package week1;

/**
 * @ClassName Exam2_19
 * @Description TODO
 * @Author 南风有你
 * @Date 2020/10/7
 **/
public class Exam2_19 {
    public static void swap(DLinkNode1<Integer> p,DLinkNode1<Integer> q){
        int tmp = p.date;
        p.date = q.date;
        q.date = tmp;
        tmp = p.freq;
        p.freq = q.freq;
        q.freq = tmp;
    }
    public static boolean LocateElem(DLinkListClass1<Integer> L,Integer x){
       DLinkNode1<Integer> p,pre;
       p = L.dhead.next;
    while (p != null && !p.date.equals(x)){
        p = p.next;}
    if (p ==null){
        return false;}
    p.freq++;
    pre = p.prior;
    while (pre!=L.dhead && pre.freq<p.freq){
        swap(pre, p);
        p = pre;
        pre = p.prior;
    }
    return true;
}
public static void Find(DLinkListClass1<Integer> L,Integer x) {
    System.out.println("查找值为 "+ x +" 的结点");
    if (LocateElem(L, x)) {
        System.out.println("查找成功，双链表L: " + L.toString());
    } else {
        System.out.println("查找失败");
    }
}
    public static void main(String args[]){
        Integer [] a ={1,2,3,4,5,6};
        DLinkListClass1<Integer> L =new DLinkListClass1<Integer>();
        L.CreateListR(a);
        System.out.println("L: "+L.toString());
        Find(L,5);
        Find(L,1);
        Find(L,4);
        Find(L,5);
        Find(L,2);
        Find(L,4);
        Find(L,5);
    }

}