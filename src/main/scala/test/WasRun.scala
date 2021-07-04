package test

case class WasRun(name: String) extends TestCase(name) {
  var log: String = ""

  def testMethod(): Unit = {
    log += "testMethod "
  }

  def testBrokenMethod(): Unit = {
    throw new RuntimeException("broken method")
  }

  override def setUp(): Unit = {
    log = "setUp "
  }

  override def tearDown(): Unit = {
    log += "tearDown "
  }
}
