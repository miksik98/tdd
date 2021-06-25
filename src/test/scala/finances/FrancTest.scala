package finances

import org.scalatest.{FunSuite, Matchers}

class FrancTest extends FunSuite with Matchers {
  test("testFrancMultiplication") {
    val five = new Franc(5)
    five.times(2) shouldBe new Franc(10)
    five.times(3) shouldBe new Franc(15)
  }
}