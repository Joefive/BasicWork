package com.sunrise.day20;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Predicate接口只要用于判断；
 * 方法：test()方法主要进行判断，返回布尔值
 * and()方法，可以连接多个判断条件：与&& ||或 !取反
 */
public class Demo06Predicate {
    public static void main(String[] args) {
        String str = "applePay";
        boolean b = lengthString(str, (string) -> string.length() > 5);
        System.out.println(b);
        System.out.println("**********************");

        String str1 = "HelloWorld..!";
        String tempStr1 = "H";
        String tempStr2 = "e";
        boolean c = checkAnd(str1, (s1) -> {
            return str1.contains(tempStr1);
        }, (s2) -> {
            return str1.contains(tempStr2);
        });
        System.out.println(str1 + "是否包含参数" + "tempStr1:" + tempStr1 + ",tempStr2:" + tempStr2 + ",字符串 : " + c);

        System.out.println("**********************");
        String str2 = "NewObject";
        boolean d = checkOr(str2, (s) -> {
            return str2.length() > 10;
        }, (s) -> {
            return str2.contains("N");
        });
        System.out.println(d);
        System.out.println("**********************");

        String str3 = "AbcDef";
        boolean e = checkNegate(str3, (s) -> {
            return str3.length() > 5;
        });
        System.out.println("**********************");

        String[] arr = {"张一,21", "张二二,20", "张三三,18", "张老五,23"};
        ArrayList<String> list = filterAge(arr, (s) -> {
            return s.split(",")[0].length() > 2;
        }, (s) -> {
            //字符串转换为int类型
            return Integer.parseInt(s.split(",")[1]) >= 20;
        });
        //遍历list集合，查看符合条件的元素
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * Predicate接口，调用test方法相当于构造一个对象
     * 使用test方法来判断传递参数字符串长度
     *
     * @param str
     * @param predicate
     * @return
     */
    public static boolean lengthString(String str, Predicate<String> predicate) {
        return predicate.test(str);
    }

    /**
     * and方法代表逻辑与&&
     *
     * @param str
     * @param pre1
     * @param pre2
     * @return
     */
    public static boolean checkAnd(String str, Predicate<String> pre1, Predicate<String> pre2) {
        //return pre1.test(str) && pre2.test(str);
        return pre1.and(pre2).test(str);
    }

    /**
     * or方法代表逻辑||或
     *
     * @param str
     * @param str1
     * @param str2
     * @return
     */
    public static boolean checkOr(String str, Predicate<String> str1, Predicate<String> str2) {
        return str1.or(str2).test(str);
    }

    /**
     * negate方法将结果取反
     *
     * @param str
     * @param pre
     * @return
     */
    public static boolean checkNegate(String str, Predicate<String> pre) {
        //return !pre.test(str);
        return pre.negate().test(str);
    }

    /**
     * 测试练习，过滤数组年龄大于20岁并且名字中包含3个字的人员
     *
     * @param arr
     * @param pre1
     * @param pre2
     * @return
     */
    public static ArrayList<String> filterAge(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;
    }
}
