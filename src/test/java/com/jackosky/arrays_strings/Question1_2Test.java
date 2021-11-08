package com.jackosky.arrays_strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Question1_2Test {

  @Test
  void test_1() {
    assertThat(new Question1_2().checkPermutation("abc", "cab")).isTrue();
    assertThat(new Question1_2().checkPermutation("abc", "abc")).isTrue();
    assertThat(new Question1_2().checkPermutation("abc", "bac")).isTrue();
    assertThat(new Question1_2().checkPermutation("abc", "bca")).isTrue();

    assertThat(new Question1_2().checkPermutation("abc", "dac")).isFalse();
    assertThat(new Question1_2().checkPermutation("abc", "abcd")).isFalse();
    assertThat(new Question1_2().checkPermutation("abc", "asd")).isFalse();
    assertThat(new Question1_2().checkPermutation("abc", "123")).isFalse();
  }

  @Test
  void test_2() {
    assertThat(new Question1_2().checkPermutation_N("abc", "cab")).isTrue();
    assertThat(new Question1_2().checkPermutation_N("abc", "abc")).isTrue();
    assertThat(new Question1_2().checkPermutation_N("abc", "bac")).isTrue();
    assertThat(new Question1_2().checkPermutation_N("abc", "bca")).isTrue();

    assertThat(new Question1_2().checkPermutation_N("abc", "dac")).isFalse();
    assertThat(new Question1_2().checkPermutation_N("abc", "abcd")).isFalse();
    assertThat(new Question1_2().checkPermutation_N("abc", "asd")).isFalse();
    assertThat(new Question1_2().checkPermutation_N("abc", "123")).isFalse();
  }

}
