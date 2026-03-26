ThisBuild / scalaVersion := "3.8.2"

lazy val template = (project in file("."))
  .settings(
    name := "FizzBuzz",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.20" % Test
  )
