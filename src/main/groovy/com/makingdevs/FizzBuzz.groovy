package com.makingdevs

class FizzBuzz {

  List<String> sequence(Integer n) {
    (1..n).collect { i -> play(i) }
  }

  String play(Integer n) {
    if(!n) return "0"
    if(n % (3*5) == 0) return "FizzBuzz"
    if(n % 5 == 0) return "Buzz"
    if(n % 3 == 0) return "Fizz"
    n.toString()
  }
}
