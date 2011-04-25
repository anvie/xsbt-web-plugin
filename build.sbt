seq(ScriptedPlugin.scriptedSettings :_*)

sbtPlugin := true

organization := "com.github.siasia"

name := "xsbt-web-plugin"

version := "0.1-SNAPSHOT"

libraryDependencies <<= (libraryDependencies, appConfiguration) {
  (deps, app) =>
  val version = app.provider.id.version
  deps ++ Seq(
    "org.scala-tools.sbt" %% "web-app" % version,
    "org.scala-tools.sbt" %% "classpath" % version
  )
}