package com.JahidsCode;

// Generic class is used for receiving different types
// of data in the class constructor

public class LearnGeneric<T1, T2> {
    private T1 firstData;
    private T2 secondData;

    public LearnGeneric(T1 firstData, T2 secondData){
        this.firstData = firstData;
        this.secondData = secondData;
    }

    public T1 getFirstData(){
        return firstData;
    }

    public T2 getSecondData(){
        return secondData;
    }

    // Generic method are used for different types of data as method parameter
    public <T> void genericMethod(T data){
        System.out.println("This is a Generic Method with data " + data + " and data type " + data.getClass().getName());
    }
}
