package com.sunrise.day01;

/**
 * 加、减、乘、除、MOD(实用整数，不实用小数)
 * 运算符如果遇到不一样类型，向上(向大的类型)转换
 */
public class Demo04Operator {
    public static void main(String[] args) {
        System.out.println(10 + 20);
        int a = 10;
        int b = 3;
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));
        /**
         * "+"号String字符串连接使用+都会变成字符串拼接。
         */
        String name = "java";
        System.out.println(name + 20);
        /**
         *1.自加操作跟自减操作，单独使用没有任何区别++num与num++没有区别
         *2.混合使用，++num先加后用，num++先用后加
         *3.常量不能用于自加与自减
         */
        byte num = 1;
        ++num;
        System.out.println("num=" + num);
        short num1 = 10;
        System.out.println(++num1);
        System.out.println(num1);
        int num2 = 20;
        System.out.println(num2++);
        System.out.println(num2);
        int x = 10;
        int y = 20;
        int result = ++x + y--;
        System.out.println(result);
        System.out.println(x);
        System.out.println(y);
        /**
         * 赋值：1.单个等号进行赋值；
         * 2.复合运算符+=，-+，*=，/=，%=；
         */
        int e = 10;
        e += 5;
        System.out.println("e+=5:" + e);
        int f = 20;
        f %= 3;
        System.out.println("f%=3:" + f);
        /**
         * 比较运算符：相等用==表示，<小于，>大于 ，<=小于等于，，>=大于等于，！=不等于
         */
        System.out.println(1 == 1);
        System.out.println(1 > 2);
        System.out.println(22 != 22);
        /**
         * 逻辑运算符：与&&、或||、非！；
         * 与，或，有短路效果，执行成功一个不执行下一个；两边必须都是boolean
         */
        System.out.println(3 > 1 && 1 < 0);
        System.out.println(3 > 1 || 3 < 2);
        int j = 10;
        System.out.println(3 < 1 && ++a < 100);
        System.out.println(j);
        /**
         * 三元运算符，三目运算,条件是否成立？成立执行A：不成立执行B执行.
         */
        int aa=13;
        int bb=26;
        int max = aa>bb?aa:bb;
        System.out.println(max);
        System.out.println("max="+max);
    }
}
