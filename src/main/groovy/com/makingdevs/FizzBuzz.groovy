package com.makingdevs

class FizzBuzz {

  List<String> sequence(Integer n) {
    (1..n).collect { i -> play(i) }
  }

  String play(Integer n) {
    if(n % (3*5)) return "FizzBuzz"
    if(n % 5) return "Buzz"
    if(n % 3) return "Fizz"
    n.toString()
  }
}
