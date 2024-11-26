package com.introduction.CollectionsConcept;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new java.util.ArrayList<Integer>();

        nums.add(6);
        nums.add(60);
        nums.add(69);
        nums.add(67);

        System.out.println(nums.get(2));

        for (Integer integer : nums) {
            System.out.println(integer);
        }

    }
}
