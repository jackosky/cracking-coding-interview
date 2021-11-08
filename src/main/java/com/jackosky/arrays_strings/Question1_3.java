package com.jackosky.arrays_strings;


public class Question1_3 {

  public String urlify(char[] url, int length) {
    String spaceReplacement = "%20";
    StringBuilder sb = new StringBuilder();
    int i = 0;
    while (i < length) {
      char current = url[i];
      if (current != ' ') {
        sb.append(url[i]);
      } else {
        sb.append(spaceReplacement);
      }
      i++;
    }
    return sb.toString();
  }

  public String urlify_inPlace(char[] url, int length) {
    //TODO:: work on in place algorithm
    return "null";
  }

}
