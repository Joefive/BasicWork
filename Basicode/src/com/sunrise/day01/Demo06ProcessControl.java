package com.sunrise.day01;

public class Demo06ProcessControl {
    public static void main(String[] args) {
        /**
         * 1.单if语句
         */
        int age = 19;
        if (age > 18) {
            System.out.println("可以进入..!");
        }
        System.out.println("年龄不达标，未满18岁...!");

        //2.标准if...else语句
        int num = 13;
        if (num % 2 == 0) {
            System.out.println(num + "是偶数!");
        } else {
            System.out.println(num + "是奇数!");
        }

        //3.扩展if...else if...else...if...else语句
        int x = -10;
        int y;
        if (x > 3) {
            y = 2 * x + 1;
        } else if (-1 < x && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println("y的值=" + y);

        int score = 120;
        if (score >= 90 && score <= 100) {
            System.out.println(score + "分，成绩优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println(score + "分，成绩良好");
        } else if (score >= 60 && score < 80) {
            System.out.println(score + "分，成绩及格");
        } else if (score >= 0 && score < 60) {
            System.out.println(score + "分，成绩不及格，需要补考...!");
        } else {
            System.out.println(score + "分，成绩异常，请上报辅导员");
        }

        //if语句使用三目运算替换
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("最大值=" + max);
        if (a > b) {
            System.out.println("最大值=" + max + "来自数据a");
        } else {
            System.out.println("最大值=" + max + "来自数据b");
        }

        /**
         * switch语句，条件部分小括号里面至能写：btye,short,char,int；引用类型：string,enum枚举
         * case后面的值不可以重复，case顺序可以颠倒。
         */
        int week = 2;
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("日期填写错误");
                break;
        }

        /**
         * for循环步骤：1.初始化语句2.条件判断3.循环体4.步进语句
         */
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            count += i;
        }
        System.out.println("count=" + count);

        /**
         * while循环：
         */
        int count1 = 0;
        int wi = 0;
        while (wi <= 100) {
            count1 += wi;
            wi++;
        }
        System.out.println("count1=" + count1);

        /**
         * do...while循环
         * do...while循环中循环体至少会执行一次
         */
        int count2 = 0;
        int di = 0;
        do {
            count2 += di; //至少执行一次
            di++;
        } while (di <= 100);
        System.out.println("count2=" + count2);
        System.out.println("di=" + di);

        /**
         *求0~100以内的偶数之和
         */

        int count3 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                count3 += i;
            }
        }
        System.out.println("count3=" + count3);

        int count4 = 0;
        int wii = 0;
        while (wii <= 100) {
            if (wii % 2 == 0) {
                count4 += wii;
            }
            wii++;
        }
        System.out.println("count4=" + count4);

        /**
         * break也可以在其他循环中使用
         * continue跳过当前内容，进行下一次
         */
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("hello" + i);
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("循环第" + i + "次！");
        }

        /**
         * 嵌套循环9*9
         */

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"X"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
