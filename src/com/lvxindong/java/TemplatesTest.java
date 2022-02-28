package com.lvxindong.java;

import com.lvxindong.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lvxindong
 * @data 2022/2/28 -15:55
 * 1 IDEA模板所在位置Setting - Enitor -Live Templates /Postfix Completion
 * 2 常用模板
 **/
public class TemplatesTest {
    //模板一 psvm
    public static void main(String[] args) {
        //模板二  sout
        System.out.println("hello");
        //soutp 输出当前方法形参
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm 打印方法名
        System.out.println("TemplatesTest.main");
        //soutv输出参数
        int n=1;
        System.out.println("n = " + n);
        int n2=2;
        System.out.println(n2);
        //模板三fori
        String[] strings = new String[]{"aaaaa","sssss","ddddd","fffff"};
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }
        //iter
        for (String string : strings) {
            System.out.println("string = " + string);
            
        }
        //itar
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];

        }
        //模板四list.for
        ArrayList<Integer> aaa = new ArrayList<>();
        aaa.add(555);
        aaa.add(111);
        aaa.add(22);
        aaa.add(3);
        for (Integer integer : aaa) {
            System.out.println("integer = " + integer);
        }
        //list.fori正序遍历
        for (int i = 0; i < aaa.size(); i++) {
            
        }
        //list.forr逆序遍历
        for (int i = aaa.size() - 1; i >= 0; i--) {
            
        }
        //模板五ifn
        if (aaa == null) {

        }
        //变形inn
        if (aaa != null) {

        }
        //变形xxx.nn xxx.null
        if (aaa != null) {

        }
    }
    //模板六 prsf
    private static final Customer CUST=new Customer();
    //psf
    public static final int NUM=1;
    public static final String NATION="China";
    //生成模板的演示
    public void test(){
    }
}


