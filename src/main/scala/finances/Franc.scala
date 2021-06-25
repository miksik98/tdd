package finances

class Franc(val amount: Int) extends Money {
  def times(multiplier: Int): Franc = {
    new Franc(amount * multiplier)
  }
}