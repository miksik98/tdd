package finances

trait Money {
  protected val amount: Int

  override def equals(obj: Any): Boolean = {
    val money: Money = obj.asInstanceOf[Money]
    amount == money.amount && getClass.equals(money.getClass)
  }

  def times(multiplication: Int): Money
}

object Money {
  def dollar(amount: Int): Money = new Dollar(amount)
  def franc(amount: Int): Money = new Franc(amount)
}