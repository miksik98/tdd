package finances

import org.scalatest.{FunSuite, Matchers}

class FrancTest extends FunSuite with Matchers {
  test("testFrancMultiplication") {
    val five = Money.franc(5)
    five.times(2) shouldBe Money.franc(10)
    five.times(3) shouldBe Money.franc(15)
  }
}