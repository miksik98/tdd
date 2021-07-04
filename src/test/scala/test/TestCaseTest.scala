package test

case class TestCaseTest(name: String) extends TestCase(name) {
  private var result: Option[TestResult] = None

  private def getTestResult: TestResult = result.get

  private def setTestResult(tr: TestResult): Unit = result = Some(tr)

  def testTemplateMethod(): Unit = {
    val test = WasRun("testMethod")
    test.run(getTestResult)
    assert(test.log == "setUp testMethod tearDown ")
  }

  def testResult(): Unit = {
    val test = WasRun("testMethod")
    val result = test.run(getTestResult)
    assert("1 run, 0 failed" == result.summary)
  }

  def testFailedResult(): Unit = {
    val test = WasRun("testBrokenMethod")
    val result = test.run(getTestResult)
    assert("1 run, 1 failed" == result.summary)
  }

  def testFailedResultFormatting(): Unit = {
    val result = TestResult()
    result.testStarted
    result.testFailed
    assert("1 run, 1 failed" == result.summary)
  }

  def testSuite(): Unit = {
    val suite = TestSuite()
    suite.add(WasRun("testMethod"))
    suite.add(WasRun("testBrokenMethod"))
    suite.run(getTestResult)
    assert("2 run, 1 failed" == getTestResult.summary)
  }

  override def setUp(): Unit = {
    setTestResult(TestResult())
  }

  override def tearDown(): Unit = {}
}

object TestCaseTest {
  def main(args: Array[String]): Unit = {
    val suite = TestSuite()
    suite.add(TestCaseTest("testTemplateMethod"))
    suite.add(TestCaseTest("testResult"))
    suite.add(TestCaseTest("testFailedResultFormatting"))
    suite.add(TestCaseTest("testFailedResult"))
    suite.add(TestCaseTest("testSuite"))
    val result = TestResult()
    suite.run(result)
    println(result.summary)
  }
}
