// Comment to get more information during initialization
logLevel := Level.Warn

ivyLoggingLevel in ThisBuild := UpdateLogging.Quiet

resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayIvyRepo("7thsense", "sbt-plugins")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.3.15")
//addSbtPlugin("net.lullabyte" % "sbt-chrome-plugin" % "2322da3adcc7be79da5db8ca4ab5c566fb2659e9")
