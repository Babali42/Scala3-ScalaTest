ThisBuild / scalaVersion := "3.8.3"

lazy val template = (project in file("."))
  .settings(
    name := "kata",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.20" % Test
    )
  )
