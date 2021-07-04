package test

case class TestCaseTest(name: String) extends TestCase(name) {
  private var test: Option[WasRun] = None

  private def getTest: WasRun = test.get

  private def setTest(t: WasRun): Unit = test = Some(t)

  def testTemplateMethod(): Unit = {
    setTest(WasRun("testMethod"))
    getTest.run()
    assert(getTest.log == "setUp testMethod tearDown ")
  }

  def testResult(): Unit = {
    val test = WasRun("testMethod")
    val result = test.run()
    assert("1 run, 0 failed" == result.summary)
  }

  def testFailedResult(): Unit = {
    val test = WasRun("testBrokenMethod")
    val result = test.run()
    assert("1 run, 1 failed" == result.summary)
  }

  override def setUp(): Unit = {}

  override def tearDown(): Unit = {}
}

object TestCaseTest {
  def main(args: Array[String]): Unit = {
    TestCaseTest("testTemplateMethod").run()
    TestCaseTest("testResult").run()
    TestCaseTest("testFailedResult").run()
  }
}
