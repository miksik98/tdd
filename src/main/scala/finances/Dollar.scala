package finances

class Dollar(val amount: Int) {
  def times(multiplier: Int): Dollar = {
    new Dollar(amount * multiplier)
  }

  override def equals(obj: Any): Boolean = {
    val dollar = obj.asInstanceOf[Dollar]
    amount == dollar.amount
  }
}
