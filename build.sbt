import ScalaxbKeys._

name := "eWay API"

version := "1.0.1"

organization := "org.birchavenue"

scalaVersion := "2.10.2"

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases"
                )

libraryDependencies ++= Seq("net.databinder.dispatch" %% "dispatch-core"      % "0.11.0",
                            "ch.qos.logback"          % "logback-classic"     % "1.0.6",
                            "org.scalaj"              % "scalaj-time_2.10.2"  % "0.7")

scalacOptions ++= Seq("-deprecation", "-unchecked")


seq(scalaxbSettings: _*)

wrapContents in scalaxb in Compile := Seq("{https://api.ewaypayments.com/}TokenCustomer")


//{https://api.ewaypayments.com/}TokenCustomer
packageName in scalaxb in Compile := "org.birchavenue.eway"

protocolPackageName in scalaxb in Compile := Some("org.birchavenue.eway")

//sourceGenerators in Compile <+= scalaxb in Compile
