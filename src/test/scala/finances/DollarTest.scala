package finances

import org.scalatest.{FunSuite, Matchers}

class DollarTest extends FunSuite with Matchers {
  test("testMultiplication") {
    val five = new Dollar(5)
    five.times(2) shouldBe new Dollar(10)
    five.times(3) shouldBe new Dollar(15)
  }

  test("testEquality") {
    new Dollar(5).equals(new Dollar(5)) shouldBe true
    new Dollar(5).equals(new Dollar(6)) shouldBe false
  }
}