package com.sunrise.day12;
import com.sunrise.util.*;

/**
 * 可变参数，在JDK1.5以后出现的新特性
 * 格式：修饰符 返回值类型 方法名(参数类型...行参数名){}
 * 参数底层实际是一个数组，根据传递参数的长度来创建不同长度的数组。
 * 注意：1.只能有一个可变参数，不能有多个可变参数；2.如果有多个参数，可变参数必须放在末尾；
 *      3.终极版本Object...obj */
public class ChangeArgs {
    public static void main(String[] args) {
        int sum = Util.sumAny(66, 33, 100, 300);
        System.out.println(sum);
    }

    /**
     * 计算(0~n)个数之和
     * @param arr
     * @return
     */
    private static int sumAny(int... arr) {
        System.out.println(arr);
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
