package com.daily.coreJava;

/**
 * Created by Azir on 2018/10/13.
 */

    /*
    *   java 核心部分知识点回顾 :
    *   类加载顺序
    *    父类优先，静态优先的原则；
    *    jvm 加载 一个类的时候，首先会判断 该类是否 有继承 父类；如果有，则会先加载父类，重复此操作 直到 加载到 根节点类 为止
     *    初始化 类的时候。 jvm 会优先加载 静态 field . 静态 代码块，
    *
    * */
public class day1 {
    public static void main(String[] args) {

        Son son=new Son();
      /*  this is father's static methods
        this is son's static methods
        this is father's construct()
        this is son's  construct()*/

        Father father=new Father();
       /* this is father's construct()*/

    }

}

//父类
class Father{
    static String field="father field";
    static{
        System.out.println("this is father's static methods ");
    }

    public Father() {
        System.out.println("this is father's construct() ");
    }
}


 //子类
class  Son extends Father{
    static {
        System.out.println("this is son's static methods");
    }

    public Son() {
        System.out.println("this is son's  construct() ");
    }
}