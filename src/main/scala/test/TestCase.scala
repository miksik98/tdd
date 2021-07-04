package test

abstract class TestCase(name: String) {
  final def run(): TestResult = {
    val result = TestResult()
    result.testStarted
    setUp()
    val method = getClass.getMethod(name)
    method.invoke(this)
    tearDown()
    result
  }

  def setUp(): Unit

  def tearDown(): Unit
}
