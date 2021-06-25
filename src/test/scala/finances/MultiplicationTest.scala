package finances

import org.scalatest.{FunSuite, Matchers}

class MultiplicationTest extends FunSuite with Matchers {
  test("testMultiplication") {
    val five = new Dollar(5)
    five.times(2)
    five.amount shouldBe 10
  }
}