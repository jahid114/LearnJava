package com.JahidsCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class LearnStream {
    public static void learnSteamRange(){
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);
        System.out.println(Arrays.toString(intStream.toArray()));//[1,2]
        System.out.println(Arrays.toString(longStream.toArray()));//[1,2,3]
    }
    public static List<Integer> generateIntegerList(int start, int end, int gap){
        return Stream.iterate(start, n -> n+gap).limit((int)((end-start)/gap)+1).collect(Collectors.toList());
    }
}
