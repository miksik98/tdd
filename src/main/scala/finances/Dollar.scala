package finances

class Dollar(val amount: Int) {
  def times(multiplier: Int): Dollar = {
    new Dollar(amount * multiplier)
  }
}
