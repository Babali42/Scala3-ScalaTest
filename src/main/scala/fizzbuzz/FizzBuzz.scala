package fizzbuzz;

def fizzBuzz(i: Int) : String = 
        (i%3 == 0, i%5 == 0) match {
            case (true, false) => "Fizz"
            case (false, true) => "Buzz"
            case (true, true) => "FizzBuzz"
            case (false, false) => i.toString
        }

@main def hello() = for(i <- 0 until 100) {
  println(fizzBuzz(i))
}