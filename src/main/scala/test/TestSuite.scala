package test

case class TestSuite() {
  private var tests: List[TestCase] = List()

  def add(test: TestCase): Unit = {
    tests = tests :+ test
  }

  def run(result: TestResult): Unit = {
    tests.foreach(_.run(result))
  }
}
