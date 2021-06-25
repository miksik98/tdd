package finances

import org.scalatest.{FunSuite, Matchers}

class MultiplicationTest extends FunSuite with Matchers {
  test("testMultiplication") {
    val five = new Dollar(5)
    val product1 = five.times(2)
    product1.amount shouldBe 10
    val product2 = five.times(3)
    product2.amount shouldBe 15
  }
}