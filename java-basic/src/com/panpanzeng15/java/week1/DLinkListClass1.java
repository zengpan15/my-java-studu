package week1;

/**
 * @ClassName DLinkListClass1
 * @Description TODO
 * @Author 南风有你
 * @Date 2020/10/7
 **/
class DLinkListClass1<E> {
    DLinkNode1<E> dhead;
    public DLinkListClass1(){
        dhead = new DLinkNode1<E>();
        dhead.prior = null;
        dhead.next = null;
    }
    public void CreateListR(E[] a){
        DLinkNode1<E> s,t;
        t = dhead;
        for (int i =0;i<a.length;i++){
            s = new DLinkNode1<E>(a[i]);
            t.next = s;
            s.prior = t;
            t = s;
        }
        t.next = null;
    }
    public String toString(){
        String ans ="";
        DLinkNode1<E> p =dhead.next;
        while (p != null){
            ans += p.date+"["+p.freq+"]";
            p = p.next;
        }
        return ans;
    }
}
