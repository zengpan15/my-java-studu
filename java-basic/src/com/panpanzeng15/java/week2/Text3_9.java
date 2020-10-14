public class Text3_9 {
    public static void main(String[] args) {
        int sum = 0, i, j;
        for (j = 2; j <= 100; j++) {
            for (i = 2; i <= j / 2; i++) {
                if (j % i == 0) ;

            }
            if (i > j / 2) {
                System.out.println("" + j + "是素数");
            }
        }
    }
}

