package main.java.week4;
import ...
/**
 * @ClassName BaseEmployeeTest
 * @Description TODO
 * @Author 南风有你
 * @Date 2020/10/26
 **/
public class BaseEmployeeTest {
    @Test
    public void print(){

    }
    @Test
    public void getSalary(){
         BaseEmployee be = new MarketEmployee("admin");
         assertEquals(3000,be.getSalary();
    }

}
