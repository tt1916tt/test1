package com.java.dome;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Dome
 * @Author ljm
 * @Date 2020/8/22 9:19
 * @Version 1.0
 **/
public class Dome {
    public static void main(String[] args) {
        String a = "asd";
        String b = new String(a);
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(a == b);
    }
}
