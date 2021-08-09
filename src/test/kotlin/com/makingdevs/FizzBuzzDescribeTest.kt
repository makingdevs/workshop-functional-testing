package com.makingdevs

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class FizzBuzzDescribeTest : ShouldSpec() {

  init {
    context("FizzBuzz") {
      should("be 'Fizz' when a number is 3 mutiple") {
        FizzBuzz().play(3) shouldBe "Fizz"
      }
      should("be 'Buzz' when a number is 5 mutiple") {
        FizzBuzz().play(5) shouldBe "Buzz"
      }
      should("be 'FizzBuzz' when a number is 3 and 5 mutiple") {
        FizzBuzz().play(15) shouldBe "FizzBuzz"
      }
    }
  }

}
