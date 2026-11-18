ThisBuild / scalaVersion := "3.7.4"

lazy val root = (project in file("."))
  .settings(
    name := "codadvent",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
