package com.String;

import java.util.Arrays;

public class SearchInStrings {

    public static void main(String[] args) {
        String name = "AFRID";
        char target = 'F';  // Does F exist in the string
        //     boolean ans = searchLetter(name, target);
     //   System.out.println(searchLetter(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2EnhancedLoop(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) { // for every char in the string to char array check
            // converting string in to a char string array
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
        static boolean searchLetter (String name,char target){
            if (name.length() == 0) {
                return false;
            }
            // for every element in the string
            for (int i = 0; i < name.length(); i++) {
                if (target == name.charAt(i)) {
                    return true;// to get a char at any particular index of the string
                }
            }
            return false;
        }
    }

