val ScalatraVersion = "2.8.2"

inThisBuild(
  List(
    scalaVersion := "2.13.8",
    organization := "com.github.kaznak",
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision
  )
)

lazy val hello = (project in file("."))
  .settings(
    name := "My Scalatra Web App",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
      "ch.qos.logback" % "logback-classic" % "1.2.11" % "runtime",
      "com.github.pureconfig" %% "pureconfig" % "0.17.1",
      "org.eclipse.jetty" % "jetty-webapp" % "11.0.9" % "container",
      "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided"
    ),
    scalacOptions += "-Ywarn-unused"
  )

enablePlugins(SbtTwirl)
enablePlugins(JettyPlugin)
