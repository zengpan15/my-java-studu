package main.java.week4;
/**
 * @ClassName BaseEmployee
 * @Description TODO
 * @Author 南风有你
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract class.");
    }

    /**
     * 发工资
     * @return
     */

    public abstract int getSalary();
}
