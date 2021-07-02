package finances

trait Expression {
  def reduce(to: String): Money
}
