package finances

class Franc(val amount: Int) extends Money {
  private val cur: String = "CHF"

  def times(multiplier: Int): Money = {
    new Franc(amount * multiplier)
  }

  def currency: String = cur
}