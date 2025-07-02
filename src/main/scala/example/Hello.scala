package example

object Hello {
  def main(args: Array[String]): Unit = {
    def fizzBuzzString(i: Int): String =
      (i % 3 == 0, i % 5 == 0) match {
        case (true, false)  => "Fizz"
        case (false, true)  => "Buzz"
        case (true, true)   => "FizzBuzz"
        case (false, false) => i.toString
      }

    def fizzBuzz(from: Int, to: Int): Unit = {
      if (from <= to) {
        println(fizzBuzzString(from))
        fizzBuzz(from + 1, to) // recurse
      }
    }

    fizzBuzz(1, 100)
  }
}