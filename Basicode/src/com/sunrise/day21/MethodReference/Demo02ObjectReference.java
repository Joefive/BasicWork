package com.sunrise.day21.MethodReference;

/**
 * 对象名引用成员方法:对象及成员方方法都存在
 */
public class Demo02ObjectReference {
    public static void main(String[] args) {
        printString((s) -> {
            Demo02ClassObjectReference dor = new Demo02ClassObjectReference();
            dor.printUpperCase(s);
        });
        System.out.println("===================");
        //引用前提：1.对象存在；2.方法存在
        Demo02ClassObjectReference dor = new Demo02ClassObjectReference();
        printString(dor::printUpperCase);
    }

    public static void printString(Printable p) {
        p.print("tenno..wake...up...!");
    }
}
