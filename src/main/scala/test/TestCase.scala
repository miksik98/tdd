package test

abstract class TestCase(name: String) {
  final def run(result: TestResult = TestResult()): TestResult = {
    result.testStarted
    try {
      setUp()
      val method = getClass.getMethod(name)
      method.invoke(this)
    } catch {
      case e: Throwable => result.testFailed
    }
    tearDown()
    result
  }

  def setUp(): Unit

  def tearDown(): Unit
}
