lazy val root = (project in file(".")).
  enablePlugins(ParadoxPlugin).
  settings(
    name := "Akka Learn Website",
    paradoxTheme := Some(builtinParadoxTheme("generic"))
  )