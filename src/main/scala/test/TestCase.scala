package test

abstract class TestCase(name: String) {
  final def run(): TestResult = {
    val result = TestResult()
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
