package com.example.effectivekotlin.item24;

public class JavaArray {
    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 2, 1};
        Object[] objects = numbers;
        //objects[2] = "B"; //런타임 오류 발생
    }
}
