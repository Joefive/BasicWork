package com.sunrise.day10;

/**
 * String类字符串是常量，不能更改，进入常量池中；
 * private final char value[];底层实际是byte value[]数组；
 * StringBuilder称为字符串缓冲区，底层也是也是一个字符数组，但是长度可以变化，没有被final关键字修饰
 * byte[] value = new byte[16];初始化是长度16；如果超出长度会自动扩容一倍32
 * 在内存中始终是一个数组，占用内存小，效率高。
 * 构造方法：1.无参构造，创建一个空字符串；2.有参构造，创建一个字符串；
 * 成员方法：
 * 1.append：插入任意类型数据的字符串，并返回当前本身；
 * 2.insert：从下标开始插入元素(整数，字符串，浮点...任意类型)；
 */

public class Demo07StringBuilder {
    public static void main(String[] args) {
        String str1 = "张三";
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("sb2:" + sb2);
        StringBuilder rs = sb2.append(123);
        System.out.println(rs);
        StringBuilder rs1 = rs.append("ABC");
        System.out.println(rs1);
        System.out.println("==================");
        System.out.println(rs == sb2); //sb2的值赋值给了rs、rs1所以地址值不变
        System.out.println("==================");

        /**
         * 链式编程：返回值是字符串可以继续调用该方法
         */
        StringBuilder rs2 = new StringBuilder();
        StringBuilder abc = rs2.append(1).append("Abc").append(true).append(3.1415926).append("函");
        System.out.println("rs2=" + abc);
        System.out.println("*******************");

        /**
         * StringBuilder进行转换成String：String可以使用StringBuilder的构造方法转换
         * StringBuilder对象转换成String：使用StringBuilder的toString方法
         */
        String s1 = "QWEasd";
        StringBuilder rs3 = new StringBuilder(s1);
        System.out.println("rs3:" + rs3);
        String s2 = rs3.toString();
        System.out.println("s2:"+s2);
        System.out.println(s1==s2);
        System.out.println("==================");

        /**
         *delete，insert方法都是从下标开始删除或插入
         */
        StringBuilder rs4 = new StringBuilder("applePhone");
        StringBuilder delete = rs4.delete(0, 1);
        System.out.println(delete);

        try {
            rs4.insert(10,"QQ");
            System.out.println(rs4);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
