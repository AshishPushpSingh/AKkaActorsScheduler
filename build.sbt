name := """AKkaActorsScheduler"""
organization := "Self"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies += filters

libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"
