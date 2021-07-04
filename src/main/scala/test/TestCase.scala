package test

abstract class TestCase(name: String) {
  final def run(): Unit = {
    setUp()
    val method = getClass.getMethod(name)
    method.invoke(this)
  }

  def setUp(): Unit
}
