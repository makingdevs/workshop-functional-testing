package com.makingdevs

import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.*

class FizzBuzzExpectTest : ExpectSpec() {

  init {
    context("FizzBuzz") {
      expect("'Fizz' when a number is 3 mutiple") {
        FizzBuzz().play(3) shouldBe "Fizz"
      }
      expect("'Buzz' when a number is 5 mutiple") {
        FizzBuzz().play(5) shouldBe "Buzz"
      }
      expect("'FizzBuzz' when a number is 3 and 5 mutiple") {
        FizzBuzz().play(15) shouldBe "FizzBuzz"
      }
      expect("a FizzBuzz sequence....") {
        val result = FizzBuzz().sequence(6)
        result shouldBe arrayOf("1", "2", "Fizz", "4", "Buzz", "Fizz")
      }
    }
  }

}
