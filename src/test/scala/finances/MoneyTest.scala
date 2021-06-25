package finances

import org.scalatest.{FunSuite, Matchers}

class MoneyTest extends FunSuite with Matchers {
  test("testEquality") {
    Money.dollar(5).equals(Money.dollar(5)) shouldBe true
    Money.dollar(5).equals(Money.dollar(6)) shouldBe false
    Money.franc(5).equals(Money.franc(5)) shouldBe true
    Money.franc(5).equals(Money.franc(6)) shouldBe false
    Money.dollar(5).equals(Money.franc(5)) shouldBe false
  }

  test("testCurrency") {
    Money.dollar(1).currency shouldBe "USD"
    Money.franc(1).currency shouldBe "CHF"
  }
}
