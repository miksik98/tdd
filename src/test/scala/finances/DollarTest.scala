package finances

import org.scalatest.{FunSuite, Matchers}

class DollarTest extends FunSuite with Matchers {
  test("testMultiplication") {
    val five = Money.dollar(5)
    five.times(2) shouldBe Money.dollar(10)
    five.times(3) shouldBe Money.dollar(15)
  }

  test("testEquality") {
    Money.dollar(5).equals(Money.dollar(5)) shouldBe true
    Money.dollar(5).equals(Money.dollar(6)) shouldBe false
  }
}