import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FizzBuzz extends AnyFunSuite with Matchers {
    def fizzBuzz(i: Int) : String = 
        (i%3 == 0, i%5 == 0) match {
            case (true, false) => "Fizz"
            case (false, true) => "Buzz"
            case (true, true) => "FizzBuzz"
            case (false, false) => i.toString
        }

    test("Should fizzbuzz") {
        fizzBuzz(1) shouldEqual "1"
        fizzBuzz(2) shouldEqual "2"
        fizzBuzz(3) shouldEqual "Fizz"
        fizzBuzz(4) shouldEqual "4"
        fizzBuzz(5) shouldEqual "Buzz"
        fizzBuzz(6) shouldEqual "Fizz"
        fizzBuzz(7) shouldEqual "7"
        fizzBuzz(8) shouldEqual "8"
        fizzBuzz(9) shouldEqual "Fizz"
        fizzBuzz(10) shouldEqual "Buzz"
        fizzBuzz(11) shouldEqual "11"
        fizzBuzz(12) shouldEqual "Fizz"
        fizzBuzz(13) shouldEqual "13"
        fizzBuzz(14) shouldEqual "14"
        fizzBuzz(15) shouldEqual "FizzBuzz"
    }
}
