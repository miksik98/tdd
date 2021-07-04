package test

case class TestCaseTest(name: String) extends TestCase(name) {
  def testRunning(): Unit = {
    val test = WasRun("testMethod")
    assert(!test.wasRun)
    test.run()
    assert(test.wasRun)
  }
}

object TestCaseTest {
  def main(args: Array[String]): Unit = {
    TestCaseTest("testRunning").run()
  }
}
