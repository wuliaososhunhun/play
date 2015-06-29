name := "play-scala"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scaldi" %% "scaldi-play" % "0.5.4"
)
lazy val lib = RootProject(file("../play-lib"))

lazy val root = (project in file(".")).enablePlugins(PlayScala).aggregate(lib).dependsOn(lib)
