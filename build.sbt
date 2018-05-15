name := "ScalaPractice"

version := "0.1"

scalaVersion := "2.12.6"

lazy val classesAndObjects = (project in file("classesAndObjects"))   // optionally we can just say `lazy val classesAndObjects = project` since name of the folder and the variable are same
lazy val functions = (project in file("functions"))
