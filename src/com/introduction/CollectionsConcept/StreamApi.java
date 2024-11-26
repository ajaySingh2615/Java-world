package com.introduction.CollectionsConcept;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6);

        nums.forEach(n -> System.out.println(n));
    }
}
