package com.daily.coreJava;

/**
 * Created by Azir on 2018/10/13.
 */
/*
*
* 有关 字符串常量 池 相关。
*
* */
public class day2 {

    public static void main(String[] args) {
        String s="hello";
        String s1="he";
        String s2=s1+"llo";
        String s3="he"+"llo";
        String s4=new String("hello");

        System.out.println(s2==s);//false  s2 没有字符串常量池内。 s2 等效于 new(s1)+"llo"
        System.out.println(s3==s);//true   s 与s3 都是 来自 字符串常量 池内的 引用。
        System.out.println(s4==s);//fasle s对象存放在 java 队中。是一个运行时 创建的对象。s是来自字符串常量池的引用。


        //“NULL”可以作为 类名。 大写一般都不是关键字
        // 下面语句 编译运行 通过。
        //空对象 是可以直接调用 静态方法的。
        // 空对象 调用非静态 方法与属性 。 运行是会 报 空指针异常的。/
        Null nulls=null;
        nulls.say();
    }



}


class Null{

    public static void say(){
        System.out.println("say hello");
    }
}