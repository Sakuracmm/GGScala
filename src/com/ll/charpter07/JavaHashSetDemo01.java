package com.ll.charpter07;

import java.util.HashSet;

public class JavaHashSetDemo01 {
    public static void main(String[] args) {
        HashSet hs = new HashSet<String>();
        hs.add("jack");
        hs.add("alice");
        hs.add("jack1");
        hs.add("jack");
        System.out.println(hs);     //[jack1, alice, jack]
    }
}
