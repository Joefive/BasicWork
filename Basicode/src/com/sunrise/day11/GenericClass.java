package com.sunrise.day11;

/**
 * 含有泛型的类型，实例化的时候可以随意定义对象类型
 * @param <E>
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    /**
     * 泛型方法
     * @param m
     * @param <M>
     */
    public <M> void genericMethod(M m){
        System.out.println(m);
    }

    /**
     *静态泛型方法
     * @param s
     * @param <S>
     */
    public static <S> void genericMethod02(S s){
        System.out.println(s);
    }
}
