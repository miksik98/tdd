package finances

import scala.collection.mutable

class Bank {
  private val rates = new mutable.HashMap[Pair, Int]()

  def addRate(from: String, to: String, rate: Int): Unit = {
    rates.put(Pair(from, to), rate)
  }

  def rate(from: String, to: String): Int = {
    if (from == to) 1
    else {
      val rate = rates.get(Pair(from, to))
      rate.getOrElse(sys.error(s"Pair [$from, $to] not existing in hashmap"))
    }
  }

  def reduce(source: Expression, to: String): Money = {
    source.reduce(this, to)
  }
}
