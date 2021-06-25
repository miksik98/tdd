package finances

import org.scalatest.{FunSuite, Matchers}

class MoneyTest extends FunSuite with Matchers {
  test("testEquality") {
    new Dollar(5).equals(new Dollar(5)) shouldBe true
    new Dollar(5).equals(new Dollar(6)) shouldBe false
    new Franc(5).equals(new Franc(5)) shouldBe true
    new Franc(5).equals(new Franc(6)) shouldBe false
    new Dollar(5).equals(new Franc(5)) shouldBe false
  }
}
