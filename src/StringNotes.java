public class StringNotes {
    public static void main(String[] args) {
        String myString = "howdy yall";
        //                 0123456789 - a space is counted in a string
        // Strings are immutable - meaning their properties can't be changed

        System.out.println(myString.charAt(4));
        //                           charAt - self-explanatory, character at that location
        //                             - comes out as a char, not a String

        System.out.println(myString.length()-1);
        //                          length - length of a string - does not count from 0
        //                                 - position and quantity are different

        System.out.println(myString.substring(3));
        System.out.println(myString.substring(3, 7));
        //                          substring - prints the string starting from the index, can be
        //                          given 2 params - prints beginning index - second index exclusive

        System.out.println(myString.indexOf("how"));
        System.out.println(myString.indexOf("dog"));
        System.out.println(myString.lastIndexOf("all"));
        //                          indexOf - relatively straightforward, returns the beginning index of a
        //                          given string, or -1 if the given array is not present
        //                          lastIndexOf - returns the first index of a given substring, starting from
        //                          the left instead of the right as opposed to indexOf. also returns -1
        //                          if the given array is not present

        // myString.toUpperCase();  Immutable - strings cannot be modified. so, assign it to a variable
        String newString = myString.toUpperCase();
        System.out.println(newString);

        String s1 = "one";
        String s2 = "two";
        System.out.println(s1.equals(s2));
                            // equals - checks if the two strings are the same
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
                            // compareTo - compares the first index of the given strings lexicographically(ASCII);
                            // for example "o" is lexicographically smaller than "t", so s1.compareTo(s2) returns -5
                            // and vice versa : t > o, so it will return 5

    }
}
