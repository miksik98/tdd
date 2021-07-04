package test

case class WasRun(name: String) extends TestCase(name) {
  var wasRun: Boolean = false

  def testMethod(): Unit = {
    wasRun = true
  }
}
