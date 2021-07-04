package test

case class TestResult() {
  private var runCount: Int = 0
  private var errorCount: Int = 0

  def testStarted: Unit = runCount += 1

  def summary: String = s"$runCount run, $errorCount failed"

  def testFailed: Unit = errorCount += 1

}
