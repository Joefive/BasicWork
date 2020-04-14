package com.sunrise.day02;

/**修饰符 返回值类型 方法名称（参数类型 参数名）
 * 注意：不能再方法内部定义一个方法
 * 参数：
 * 返回值：return
 */

public class Day02DemoMethod {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
