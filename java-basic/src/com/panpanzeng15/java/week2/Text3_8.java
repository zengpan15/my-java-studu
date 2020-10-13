public class Text3_8 {
    public static void main(String args[]){
        int a=1;
        int sum =0;
        for(int i=1;i<=20;i++){
            int j=i;
            while(j!=0){
                a=a*j;
                j=j-1;
            }
            sum=a+sum;
            a=1;
        }
        System.out.println(sum);
    }
}