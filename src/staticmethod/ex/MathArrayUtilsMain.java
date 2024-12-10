package staticmethod.ex;

// 기본편 - section8

/*
    Simple Math Util System using static method & forbidden instantiate
 */

import static staticmethod.ex.MathArrayUtils.average;
import static staticmethod.ex.MathArrayUtils.sum;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
    }
}
