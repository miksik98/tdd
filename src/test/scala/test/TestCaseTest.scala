package test

case class TestCaseTest(name: String) extends TestCase(name) {
  private var test: Option[WasRun] = None

  private def getTest: WasRun = test.get

  private def setTest(t: WasRun): Unit = test = Some(t)

  def testRunning(): Unit = {
    getTest.run()
    assert(getTest.wasRun)
  }

  def testSetUp(): Unit = {
    getTest.run()
    assert(getTest.wasSetUp)
  }

  override def setUp(): Unit = {
    setTest(WasRun("testMethod"))
  }
}

object TestCaseTest {
  def main(args: Array[String]): Unit = {
    TestCaseTest("testRunning").run()
  }
}
