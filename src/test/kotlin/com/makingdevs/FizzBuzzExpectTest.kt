package com.makingdevs

import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe

class FizzBuzzExpectTest : ExpectSpec() {

  init {
    context("FizzBuzz") {
      expect("be 'Fizz' when a number is 3 mutiple") {
        FizzBuzz().play(3) shouldBe "Fizz"
      }
      expect("be 'Buzz' when a number is 5 mutiple") {
        FizzBuzz().play(5) shouldBe "Buzz"
      }
      expect("be 'FizzBuzz' when a number is 3 and 5 mutiple") {
        FizzBuzz().play(15) shouldBe "FizzBuzz"
      }
    }
  }

}
