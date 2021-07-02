package finances

import org.scalatest.{FunSuite, Matchers}

class MoneyTest extends FunSuite with Matchers {
  test("testEquality") {
    Money.dollar(5).equals(Money.dollar(5)) shouldBe true
    Money.dollar(5).equals(Money.dollar(6)) shouldBe false
    Money.dollar(5).equals(Money.franc(5)) shouldBe false
  }

  test("testCurrency") {
    Money.dollar(1).getCurrency shouldBe "USD"
    Money.franc(1).getCurrency shouldBe "CHF"
  }

  test("testSimpleAddition") {
    val five = Money.dollar(5)
    val sum = five.plus(five)
    val bank = new Bank()
    val reduced = bank.reduce(sum, "USD")
    reduced shouldBe Money.dollar(10)
  }

  test("testPlusReturnsSum") {
    val five = Money.dollar(5)
    val result = five.plus(five)
    val sum = result.asInstanceOf[Sum]
    five shouldBe sum.augend
    five shouldBe sum.addend
  }

  test("testReduceSum") {
    val sum = Sum(Money.dollar(3), Money.dollar(4))
    val bank = new Bank()
    val result = bank.reduce(sum, "USD")
    result shouldBe Money.dollar(7)
  }

  test("testReduceMoney") {
    val bank = new Bank()
    val result = bank.reduce(Money.dollar(1), "USD")
    result shouldBe Money.dollar(1)
  }
}
