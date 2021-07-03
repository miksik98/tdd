package finances

case class Sum(augend: Money, addend: Money) extends Expression {
  def reduce(bank: Bank, to: String): _root_.finances.Money = {
    val amount = augend.amount + addend.amount
    new Money(amount, to)
  }
}
