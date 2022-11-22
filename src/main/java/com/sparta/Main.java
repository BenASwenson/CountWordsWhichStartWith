package com.sparta;

public class Main {
    public static void main(String[] args) {

//        String name1 = "Kinga";  // string literal (still an object)
//                                // stored in the string pool
//        String name2 = new String("Joanne");
//                                // stored in the heap
//
//        String name3 = "Kinga";
//        String name4 = new String("Joanne");
//
//        String kingaUpper = name1.toUpperCase();
//
//        System.out.println(name2.equals(name4));

//        Customer c1 = new Customer("Kinga", "Kuc");
//        Customer c2 = new Customer("Kinga", "Kuc");
//        Customer c3 = new Customer("Laura", "Bird");
//
//        if(c1.equals(c3)) {
//            System.out.println("These are the same customer");
//        }

//        CountWordsWhichStartWith example = new CountWordsWhichStartWith();
//        String[] words = new String[] {"The", "cat", "in", "the", "hat"};
//        System.out.println(example.countWords(words, "t"));
//
//        CountWordsWhichStartWith example2 = new CountWordsWhichStartWith();
//        String word = "the cat in the hat";
//        System.out.println(example2.countWordsInString(word, "t"));

//        Customer c1 = new Customer("Craig", "Wroe");
//        Customer c2 = new Customer("Craig", "Wroe");
//        Customer c3 = new Customer("Craig", "Wroe");
//        Customer c4 = new Customer("Joanne", "Bevin");
//        Customer c5 = new Customer("Kinga", "Kuc");
//
//        if (c1.equals(c1)) {
//            System.out.println("These are the same customer");
//        } else {
//            System.out.println("These are not the same customer");
//        }
//
//        if (c1 == c1) {
//            System.out.println("These are the same customer");
//        } else {
//            System.out.println("These are not the same customer");
//        }

        // test the equals() contract
        // reflexive
//        System.out.println(c1.equals(c1));
//
//        // symmetric
//        if (c1.equals(c2) && c2.equals(c1)) {
//            System.out.println(c1.equals(c2));
//        }
//
//        // transitive
//        if (c1.equals(c2) && c2.equals(c3)) {
//            System.out.println(c1.equals(c3));
//        }
//
//        // consistent
//        System.out.println(c1.equals(c2));



        // test the hashcode() contract
//        System.out.println(c1.hashCode() + " " + c2.hashCode());

        CountWordsWhichStartWith countWordsWhichStartWith = new CountWordsWhichStartWith();
        System.out.println(countWordsWhichStartWith.countWords(new String[] {"The", "cat", "in", "the", "hat"}, "t"));
        System.out.println(countWordsWhichStartWith.countWordsInString("The cat in the hat", "t"));




    }
}