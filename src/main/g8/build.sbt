name := "$name$"

organization := "$organization$"

version := "0.1.0"

scalaVersion := "2.11.8"

lazy val http4sVersion = "0.15.0"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-dsl"          % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion
)
