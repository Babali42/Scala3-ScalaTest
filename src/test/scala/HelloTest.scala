import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class AddSpec extends AnyFunSuite with Matchers {
  def addTwoNumbers(a: Int, b: Int) = a + b 

  test("1 + 1 should equal 2") {
    addTwoNumbers(1,1) shouldEqual 2
  }
}