package com.daily.coreJava;

/**
 * Created by Azir on 2018/10/14.
 */

/*
*    java 关键字 final
*
*
* */
public class day3 {

    //final 修饰的 类成员变量 有三种赋值方式
    // 一种是在声明变量是就赋值
    //一种 是在 静态代码块内进行初始化
    //一种是 在构造方法内 进行赋值
    //除此之外 声明final 变量 就会报错。
    final  int a=6;
    final  static  double b;
    final  String str;



    static {
        b=6.6;
    }

    public day3(String a) {
        this.str = a;
    }
}
