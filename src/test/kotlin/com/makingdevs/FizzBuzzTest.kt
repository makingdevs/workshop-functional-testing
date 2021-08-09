package com.makingdevs

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FizzBuzzTest : FunSpec() {

  init {

    beforeEach {
      println("Hello from $it")
    }

    test("Plays FizzBuzz for Zero") {
      FizzBuzz().play(0) shouldBe "0"
    }

    afterEach {
      println("Bye $it")
    }
  }

}
