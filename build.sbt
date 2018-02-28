name := """hello-world-play"""
organization := "com.iss"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

resolvers ++= Seq(
  "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases",
  "Atlassian Releases" at "https://maven.atlassian.com/public/",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  Resolver.jcenterRepo
)

libraryDependencies ++= Seq(
  /*Compile time DI*/
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,

  /*DB access*/
  jdbc,
  evolutions,
  "org.scalikejdbc" %% "scalikejdbc"                  % "3.2.0",
  "org.scalikejdbc" %% "scalikejdbc-config"           % "3.2.0",
  "org.scalikejdbc" %% "scalikejdbc-play-initializer" % "2.6.0-scalikejdbc-3.2",
  "mysql" % "mysql-connector-java" % "6.0.6",
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.iss.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.iss.binders._"



