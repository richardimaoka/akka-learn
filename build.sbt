lazy val root = (project in file(".")).
  enablePlugins(ParadoxPlugin).
  settings(
    name := "Akka Learn Website",
    scalaVersion := "2.11.8",
    paradoxTheme := Some(builtinParadoxTheme("generic")),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-stream" % "2.4.11",
      "com.typesafe.akka" %% "akka-http-core" % "2.4.11",
      "com.typesafe.akka" %% "akka-http-experimental" % "2.4.11",
      "com.typesafe.akka" %% "akka-http-jackson-experimental" % "2.4.11",
      "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.11",
      "com.typesafe.akka" %% "akka-http-testkit" % "2.4.11",
      "com.typesafe.akka" %% "akka-http-xml-experimental" % "2.4.11"
    )
  )