package com.jackosky.arrays_strings;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question1_2 {

  //solution with n*logn
  public boolean checkPermutation(String input1, String input2) {
    if (input1.length() != input2.length()) {
      return false;
    }

    char[] charInput1 = input1.toCharArray();
    char[] charInput2 = input2.toCharArray();

    Arrays.sort(charInput1);
    Arrays.sort(charInput2);

    return Arrays.equals(charInput1, charInput2);
  }

  public boolean checkPermutation_N(String input1, String input2) {
    if (input1.length() != input2.length()) {
      return false;
    }

    Set<Character> characterSet = new HashSet<>();
    for (int i = 0; i < input1.length(); i++) {
      characterSet.add(input1.charAt(i));
    }

    for (int i = 0; i < input2.length(); i++) {
      if (!characterSet.contains(input2.charAt(i))) {
        return false;
      }
    }

    return true;
  }

}
