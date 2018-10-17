package com.daily.coreJava;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;

/**
 * Created by Azir on 2018/10/14.
 */
/*
*  bigdecimal 类
*     BigDecimal API
 *    使用BigDecimal 构造函数时， 一定要 要用 String 类型构造 函数。
  * */
public class day4 {

    public static void main(String[] args) {

        BigDecimal f1=new BigDecimal("0.05");
        BigDecimal f2=BigDecimal.valueOf(0.03);
        BigDecimal f3=new BigDecimal(0.07);

        double d1=1.1;
        int i=3;
        // BigDecimal 进行加减乘除 运算

        // ”+“
        System.out.println("f1+f3="+f1.add(f2));
        //”-“
        System.out.println("f1-f2="+f1.subtract(f2));
        // "* "
        System.out.println("f1*f2="+f1.multiply(f2));

        //"除"
        System.out.println("f3/f1="+f3.divide(f1));

        System.out.println(d1/i);

    }


}



class supers{

    public float getnum(){return 8.f;}

}

class  thiss extends  supers{

    //报错
   //public void getnum(){}

    //重载
    public float getnum(){return  2f;}


}