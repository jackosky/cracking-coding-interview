package com.jackosky.arrays_strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Question1_3Test {

  @Test
  void test_1() {
    assertThat(new Question1_3().urlify("abc".toCharArray(), 3)).isEqualTo("abc");
    assertThat(new Question1_3().urlify("a bc  ".toCharArray(), 4)).isEqualTo("a%20bc");
    assertThat(new Question1_3().urlify("a   bc      ".toCharArray(), 6)).isEqualTo("a%20%20%20bc");
  }


}
