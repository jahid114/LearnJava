package com.JahidsCode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStream {
    public static List<Integer> generateIntegerList(int start, int end, int gap){
        return Stream.iterate(start, n -> n+gap).limit(end-start).collect(Collectors.toList());
    }
}
