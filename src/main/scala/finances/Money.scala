package finances

class Money(val amount: Int, val currency: String) extends Expression {
  override def equals(obj: Any): Boolean = {
    val money: Money = obj.asInstanceOf[Money]
    amount == money.amount && getCurrency.equals(money.getCurrency)
  }

  def times(multiplier: Int): Money = {
    new Money(amount * multiplier, currency)
  }

  def getCurrency: String = currency

  def plus(addend: Money): Expression = {
    Sum(this, addend)
  }

  def reduce(to: String): Money = this

  override def toString: String = {
    s"""$amount $currency"""
  }
}

object Money {
  def dollar(amount: Int): Money = new Money(amount, "USD")

  def franc(amount: Int): Money = new Money(amount, "CHF")
}