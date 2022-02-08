name := "foo"
 
version := "1.0" 
      
lazy val `foo` = (project in file(".")).enablePlugins(PlayScala)

      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.13.5"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )
libraryDependencies += "io.monix" %% "monix" % "3.4.0"
libraryDependencies += "org.typelevel" %% "cats-core" % "2.3.0"
      