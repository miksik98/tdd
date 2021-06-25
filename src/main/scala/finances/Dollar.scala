package finances

class Dollar(val amount: Int, val currency: String) extends Money(amount, currency) {
  def times(multiplier: Int): Money = {
    Money.dollar(amount * multiplier)
  }
}
