name := "blake3"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-language:existentials",
  "-language:postfixOps",
  "-Xfatal-warnings",
  "-Yno-adapted-args",
  "-Ywarn-value-discard",
  "-Ywarn-unused-import"
  )

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

libraryDependencies ++= Seq(
  "org.typelevel"    %% "spire"         % "0.14.1",
  "org.scodec"       %% "scodec-core"   % "1.10.3",
  "org.scalatest"    %% "scalatest"     % "3.0.5"      % "test"
  )
