package com.daily.LeetsCode;

/**
 * Created by Azir on 2018/10/17.
 */

/*
*   斐波那契数列
*
*     假如 有这么一个数列             n=1  f(1)=1
*                                                    n=2       f(2)=1
*                                                    n=3      f(3)=f(1)+f(2)
*                                                    .
*                                                    .
*                                                    .
*                                                    n=n     f(n)=f(n-1)+f(n-2)
*
*                                                    例如   1，1，2，3，5，8，13 ...........
* */



public class FibonacciQuen {

    //求出 以上数列 第n个数的值
    public static void main(String[] args) {
        solution(8);

    }


    public static void solution(int n) {
                if(n<=2){
                    System.out.println("值为 1");
                }else {
                    int val=0;
                    int fn=1;
                    int prefn=1;
                    for (int i=3; i<=n ;i++){
                        val=fn+prefn;
                        prefn=fn;
                        fn=val;
                    }
                    System.out.println(String.valueOf(val));

                }

    }


}
