package test

abstract class TestCase(name: String) {
  final def run(): Unit = {
    val method = getClass.getMethod(name)
    method.invoke(this)
  }
}
