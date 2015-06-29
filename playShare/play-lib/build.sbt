val nameString = """play-lib"""

name := nameString

lazy val playLib = (project in file(".")).enablePlugins(PlayScala)

version := "1.0.1-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies++= Seq(
  "com.typesafe.play" %% "play" % "2.3.4",
  "com.typesafe.play" %% "play-ws" % "2.3.4"
)
