package finances

class Franc(val amount: Int) {
  def times(multiplier: Int): Franc = {
    new Franc(amount * multiplier)
  }

  override def equals(obj: Any): Boolean = {
    val franc = obj.asInstanceOf[Franc]
    amount == franc.amount
  }
}