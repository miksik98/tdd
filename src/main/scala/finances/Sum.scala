package finances

case class Sum(augend: Expression, addend: Expression) extends Expression {
  def reduce(bank: Bank, to: String): _root_.finances.Money = {
    val amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
    new Money(amount, to)
  }

  override def plus(addend: Expression): Expression = {
    Sum(this, addend)
  }

  override def times(multiplier: Int): Expression = {
    Sum(augend.times(multiplier), addend.times(multiplier))
  }
}
