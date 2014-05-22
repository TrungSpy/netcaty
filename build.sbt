organization := "tv.cntt"

name         := "netcaty"

version      := "1.2-SNAPSHOT"

scalaVersion := "2.11.0"

crossScalaVersions := Seq("2.10.4", "2.11.0")

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

//------------------------------------------------------------------------------

libraryDependencies += "io.netty" % "netty-all" % "4.0.19.Final"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.6" % "test"
