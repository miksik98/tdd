package finances

class Dollar(val amount: Int) extends Money {
  def times(multiplier: Int): Dollar = {
    new Dollar(amount * multiplier)
  }
}
