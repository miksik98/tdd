package finances

class Money(val amount: Int, val currency: String) extends Expression {
  override def equals(obj: Any): Boolean = {
    val money: Money = obj.asInstanceOf[Money]
    amount == money.amount && getCurrency.equals(money.getCurrency)
  }

  override def times(multiplier: Int): Expression = {
    new Money(amount * multiplier, currency)
  }

  def getCurrency: String = currency

  override def plus(addend: Expression): Expression = {
    Sum(this, addend)
  }

  override def reduce(bank: Bank, to: String): Money = {
    val rate = bank.rate(currency, to)
    new Money(amount / rate, to)
  }

  override def toString: String = {
    s"""$amount $currency"""
  }
}

object Money {
  def dollar(amount: Int): Money = new Money(amount, "USD")

  def franc(amount: Int): Money = new Money(amount, "CHF")
}