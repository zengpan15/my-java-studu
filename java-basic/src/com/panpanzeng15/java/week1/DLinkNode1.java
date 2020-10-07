//import java.util.*;
package week1;

/**
 * @ClassName DLinkNode1
 * @Description TODO
 * @Author 南风有你
 * @Date 2020/10/7
 * */
class DLinkNode1<E>{
    E date;
    int freq;
    DLinkNode1<E>prior;
    DLinkNode1<E>next;
    public DLinkNode1(){
        freq = 0;
        prior = null;
        next = null;
    }
    public DLinkNode1(E d){
        freq = 0;date = d;
        prior = null;
        next = null;
    }
}
