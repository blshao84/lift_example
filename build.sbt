name := "lift_example"

version := "0.1"

organization := "example"

scalaVersion := "2.9.1"

resolvers ++= Seq(
             "snapshots"     at "http://repo1.maven.org/maven2/",
            "releases"        at "http://repo1.maven.org/maven2/"
        )

seq(com.github.siasia.WebPlugin.webSettings :_*)


scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "2.5.1"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % liftVersion        % "compile" withSources(),
    "net.liftmodules"   %% "lift-jquery-module_2.5" % "2.3" withSources(),
    "org.eclipse.jetty" % "jetty-webapp"        % "8.1.7.v20120910"  % "container" withSources(),
    "javax.servlet" % "servlet-api" % "2.5" % "provided",
    "ch.qos.logback"    % "logback-classic"     % "1.0.6",
    "com.h2database"    % "h2"                  % "1.3.167"
        )
}

