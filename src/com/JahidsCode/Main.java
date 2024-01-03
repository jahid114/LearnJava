package com.JahidsCode;


public class Main {
    public static void main(String[] args) {
        LearnGeneric<String, Integer> studentData1 = new LearnGeneric<>("jahid", 114);
        System.out.println(studentData1.getFirstData());
        System.out.println(studentData1.getSecondData());
        studentData1.genericMethod("myName");
        LearnGeneric<Integer, String> studentData2 = new LearnGeneric<>(121,"irfan");
        System.out.println(studentData2.getFirstData());
        System.out.println(studentData2.getSecondData());
    }
}
