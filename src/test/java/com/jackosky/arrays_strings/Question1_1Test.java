package com.jackosky.arrays_strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Question1_1Test {

  @Test
  void test_1() {
    assertThat(new Question1_1().isUnique("abc")).isTrue();
    assertThat(new Question1_1().isUnique("a")).isTrue();
    assertThat(new Question1_1().isUnique("basd1")).isTrue();
    assertThat(new Question1_1().isUnique("aa")).isFalse();
    assertThat(new Question1_1().isUnique("abb")).isFalse();
    assertThat(new Question1_1().isUnique("abcda")).isFalse();
    assertThat(new Question1_1().isUnique("abacd")).isFalse();
    assertThat(new Question1_1().isUnique("abcdabcd")).isFalse();
  }

  @Test
  void test_inplace() {
    assertThat(new Question1_1().isUniqueInPlace("abc")).isTrue();
    assertThat(new Question1_1().isUniqueInPlace("a")).isTrue();
    assertThat(new Question1_1().isUniqueInPlace("basd1")).isTrue();
    assertThat(new Question1_1().isUniqueInPlace("aa")).isFalse();
    assertThat(new Question1_1().isUniqueInPlace("abb")).isFalse();
    assertThat(new Question1_1().isUniqueInPlace("abcda")).isFalse();
    assertThat(new Question1_1().isUniqueInPlace("abacd")).isFalse();
    assertThat(new Question1_1().isUniqueInPlace("abcdabcd")).isFalse();
  }

}
