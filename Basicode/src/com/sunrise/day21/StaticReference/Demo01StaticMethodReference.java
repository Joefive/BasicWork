package com.sunrise.day21.StaticReference;

public class Demo01StaticMethodReference {
    public static void main(String[] args) {
        int result = method(-10, (s) -> {
            return Math.abs(s);
        });
        System.out.println(result);

        int result2 = method(-10, Math::abs);
        System.out.println(result2);
    }

    public static int method(int number, Calcable calcable) {
        return calcable.calcAbs(number);
    }
}
