package finances

trait Money {
  protected val amount: Int

  override def equals(obj: Any): Boolean = {
    val money: Money = obj.asInstanceOf[Money]
    amount == money.amount
  }
}
