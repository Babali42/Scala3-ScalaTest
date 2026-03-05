ThisBuild / scalaVersion := "3.3.7"

lazy val template = (project in file("."))
  .settings(
    name := "FizzBuzz",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
