// Project setup
val scalaV   = "2.12.6"
val projectV = "1.0"

lazy val settings = Seq(
  version := projectV,
  scalaVersion := scalaV
)

lazy val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

lazy val rootProject = project
  .in(file("."))
  .settings(
    name := "tdd",
    version := projectV,
    libraryDependencies ++= testDependencies
  )