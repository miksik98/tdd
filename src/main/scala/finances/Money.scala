package finances

abstract class Money(amount: Int, currency: String) {
  override def equals(obj: Any): Boolean = {
    val money: Money = obj.asInstanceOf[Money]
    amount == money.amount && getClass.equals(money.getClass)
  }

  def times(multiplication: Int): Money

  def getCurrency: String = currency
}

object Money {
  def dollar(amount: Int): Money = new Dollar(amount, "USD")
  def franc(amount: Int): Money = new Franc(amount, "CHF")
}