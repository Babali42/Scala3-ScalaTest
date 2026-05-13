package kata;

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class Tests extends AnyFunSuite with Matchers {
  test("Should return identity of 1") {
    identity(1) shouldEqual 1
  }

  test("Should return identity of toto") {
    identity("toto") shouldEqual "toto"
  }
}
