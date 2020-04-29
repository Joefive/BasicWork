package com.sunrise.day07;

/**
 * default方法在Java8中引入，可以解决接口升级问题：
 * 因为接口升级如果再新增加abstract方法，接口对应的实现类都必须新增abstract方法；
 * 可以通过使用default方法来解决该问题，实现类中不必都实现新增的default方法；
 * default方法可以被实现类直接继承，可以不用重写，但重写default方法也可以。
 */
public interface DefaultInterface {
    public abstract void methodAbs();

    //    public abstract void methodAbs2();

    public default void methodDefault() {
        System.out.println("解决接口升级的default方法执行了！");
//        System.out.println("111");
//        System.out.println("222");
//        System.out.println("333");
//        methodPrivate();
    }

    public default void methodDefaultB() {
        System.out.println("接口default方法2");
//        System.out.println("111");
//        System.out.println("222");
//        System.out.println("333");
//        methodPrivate();
    }

    /**
     * Java9中接口才可以使用private方法，用来解决重复代码问题并且防止实例化对象访问
     */
//    private void methodPrivate() {
//        System.out.println("111");
//        System.out.println("222");
//        System.out.println("333");
//}
//    private static void methodStatic() {
//        System.out.println("111");
//        System.out.println("222");
//        System.out.println("333");
//}
}
