lazy val lesson1 = (project in file(".")).
  settings(
    name         := "lesson1",
    version      := "1.0",
    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq( "com.typesafe.akka" %% "akka-stream" % "2.4.10" )
  )
