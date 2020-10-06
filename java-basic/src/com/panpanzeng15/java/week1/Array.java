package com.panpanzeng15.java.week1;

/**
 * @ClassName Array
 * @Description TODO
 * @Author 南风有你
 * @Date 2020/10/6
 * **/
 public class Array {
        public static void main(String[] args) {
            int[] data = new int[]{1,17,21,31,41,51,61};
            int max = data[0];
            int min = data[0];
            int sum = data[0];
            for(int i = 1;i  < data.length;i++){
                if(data[i] > max){
                    max = data[i];
                }
                if(data[0] <min){
                    min = data[i];
                }
                sum +=data[i];
            }
            System.out.println("最大值为："+max);
            System.out.println("最小值为："+min);
            System.out.println("最大值最小值为："+sum);
        }
    }






