package com.jackosky.arrays_strings;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question1_1 {

  //first attempt
  public boolean isUnique(String input) {
    Set<Character> duplicates = new HashSet<>();
    for (int i = 0; i < input.length(); i++) {
      char character = input.charAt(i);
      if (duplicates.contains(character)) {
        return false;
      }
      duplicates.add(character);
    }
    return true;
  }

  public boolean isUniqueInPlace(String input) {
    for (int i = 0; i < input.length(); i++) {
      char character = input.charAt(i);
      if (input.substring(i + 1).contains(Character.toString(character))) {
        return false;
      }
    }
    return true;
  }

  public boolean isUniqueInOrder(String input) {
    char[] chars = input.toCharArray();
    Arrays.sort(chars);
    for (int i = 0; i < chars.length; i++) {
      char character = input.charAt(i);
      if (Arrays.binarySearch(chars, i + 1, chars.length, character) >= 0) {
        return false;
      }
    }
    return true;
  }

}
