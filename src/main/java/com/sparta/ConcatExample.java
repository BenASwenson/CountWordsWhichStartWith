package com.sparta;


public class ConcatExample {

    public void concatExample() {
        String[] names = {"Yash", "Liam", "Iman", "Rob", "Patryk"};
        StringBuilder result = new StringBuilder();

//        for(String name: names) {
//            result.append(name);
//            result.append(", ");
//        }
//
//        System.out.println(result.toString());


        for (int i = 0; i < names.length; i++) {
            names[i] = i + ":" + names[i];   // adds the index
            result.append(names[i]);
            result.append(", ");
        }
        System.out.println(result);
    }



}
