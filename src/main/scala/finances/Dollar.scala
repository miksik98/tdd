package finances

class Dollar(val amount: Int) extends Money {
  private val cur: String = "USD"

  def times(multiplier: Int): Money = {
    new Dollar(amount * multiplier)
  }

  def currency: String = cur
}
