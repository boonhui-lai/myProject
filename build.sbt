name := "myProject"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.4",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.mockito" % "mockito-all" % "1.10.19" % "test"
)