package com.JahidsCode;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*LearnGeneric<String, Integer> studentData1 = new LearnGeneric<>("jahid", 114);
        System.out.println(studentData1.getFirstData());
        System.out.println(studentData1.getSecondData());
        studentData1.genericMethod("myName");
        LearnGeneric<Integer, String> studentData2 = new LearnGeneric<>(121,"irfan");
        System.out.println(studentData2.getFirstData());
        System.out.println(studentData2.getSecondData());*/

        List<Integer> evenNumberUpto100 = LearnStream.generateIntegerList(2,100, 2);
        List<Integer> multipleOf5Upto100 = LearnStream.generateIntegerList(5,100, 5);

        System.out.println(multipleOf5Upto100.toString());
    }
}
