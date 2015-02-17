name := """newBlog"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.sandinh" % "play-hikaricp_2.11" % "1.7.1",
  "com.typesafe.slick" %% "slick" % "3.0.0-M1",
  "mysql" % "mysql-connector-java" % "5.1.34",
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" % "bootstrap" % "3.3.1",
  "org.webjars" % "jquery" % "2.1.3",
  "org.webjars" % "less" % "2.1.0",
  filters
)

libraryDependencies ~= { _.filterNot(m => m.organization == "com.typesafe.play" && m.name == "play-test") }

includeFilter in (Assets, LessKeys.less) := "*.less"

excludeFilter in (Assets, LessKeys.less) := "_*.less"
