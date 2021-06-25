package finances

class Franc(val amount: Int, val currency: String) extends Money(amount, currency) {
  def times(multiplier: Int): Money = {
    Money.franc(amount * multiplier)
  }
}