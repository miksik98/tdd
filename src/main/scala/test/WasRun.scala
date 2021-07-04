package test

case class WasRun(name: String) extends TestCase(name) {
  var wasRun: Boolean = false
  var wasSetUp: Boolean = false

  def testMethod(): Unit = {}

  override def setUp(): Unit = {
    wasSetUp = true
    wasRun = true
  }
}
