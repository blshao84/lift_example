name := "lift_example"

version := "0.1"

organization := "example"

scalaVersion := "2.9.1"

resolvers ++= Seq(
             "snapshots"     at "http://repo1.maven.org/maven2/",
            "releases"        at "http://repo1.maven.org/maven2/"
        )

seq(com.github.siasia.WebPlugin.webSettings :_*)

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "2.5-M4"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % liftVersion        % "compile" withSources(),
    "net.liftweb"       %% "lift-mapper"        % liftVersion        % "compile" withSources(),
    "net.liftmodules"   %% "lift-jquery-module" % (liftVersion+"-2.1") withSources(),
    "net.liftweb"       %% "lift-textile" % "2.4-M5" % "compile" withSources(),
    "net.liftweb"       %% "lift-util" % "2.4-M5" % "compile" withSources(),
    "net.liftweb"       %% "lift-actor" % "2.4-M5" % "compile" withSources(),
    "net.liftweb"       %% "lift-common" % "2.4-M5" % "compile" withSources(),
    "net.liftweb"       %% "lift-db" % "2.4-M5" % "compile" withSources(),
    "net.liftweb"       %% "lift-proto" % "2.4-M5" % "compile" withSources(),
    "net.liftweb"       %% "lift-machine" % "2.4-M5" % "compile" withSources(),
    "net.liftweb"       %% "lift-paypal" % "2.4-M5" % "compile" withSources(),
    "org.apache.httpcomponents" % "httpmime" % "4.2.2" % "compile" withSources(),
    "org.eclipse.jetty" % "jetty-webapp"        % "8.1.7.v20120910"  % "container" withSources(),
    "mysql" % "mysql-connector-java" % "5.1.12" % "compile",
    "postgresql" % "postgresql" % "9.0-801.jdbc4" % "compile" withSources(),
    "net.liftweb" %% "lift-machine" % "2.4-M5" % "compile" withSources(),
    "net.liftweb" %% "lift-paypal" % "2.4-M5" % "compile" withSources(),
    "javax.servlet" % "servlet-api" % "2.5" % "provided",
    "ch.qos.logback"    % "logback-classic"     % "1.0.6",
    "org.specs2"        %% "specs2"             % "1.12.1"           % "test",
    "com.h2database"    % "h2"                  % "1.3.167",
    "junit"             % "junit"               % "4.5"              % "test->default",
    "org.scala-tools.testing"   % "specs_2.9.1"      % "1.6.9"           % "test->default",
    "org.scalatest" % "scalatest" % "1.3" % "test",
    "org.apache.httpcomponents" % "httpclient" % "4.2.3" % "compile" withSources()
        )
}

