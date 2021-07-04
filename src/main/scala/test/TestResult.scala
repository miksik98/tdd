package test

case class TestResult() {
  private var runCount: Int = 0

  def testStarted: Unit = runCount += 1

  def summary: String = s"$runCount run, 0 failed"
}
