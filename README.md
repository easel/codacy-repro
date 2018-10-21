# How to use:
```
CODACY_PROJECT_TOKEN=x sbt clean coverage test coverageReport coverageAggregate codacyCoverage
```

# What happens:

```
[error] java.lang.NoSuchMethodError: io.circe.JsonObject.fields()Lscala/collection/immutable/Vector;
[error] 	at rapture.json.jsonBackends.circe.CirceAst$.getKeys(ast.scala:41)
[error] 	at rapture.json.formatters_1.general(formatters.scala:67)
[error] 	at rapture.json.formatters$compact$$anon$1.format(formatters.scala:32)
[error] 	at rapture.json.formatters$compact$$anon$1.format(formatters.scala:30)
[error] 	at rapture.data.DataCompanion.format(data.scala:110)
[error] 	at rapture.data.DataCompanion.format$(data.scala:109)
[error] 	at rapture.json.Json$.format(json.scala:99)
[error] 	at com.codacy.api.helpers.FileHelper$.writeJsonToFile(FileHelper.scala:49)
[error] 	at com.codacy.CodacyCoveragePlugin$.$anonfun$codacyCoverageCommand$9(CodacyCoveragePlugin.scala:73)
[error] 	at com.codacy.api.helpers.FileHelper$.$anonfun$withTokenAndCommit$3(FileHelper.scala:21)
[error] 	at scala.Option.map(Option.scala:146)
[error] 	at com.codacy.api.helpers.FileHelper$.$anonfun$withTokenAndCommit$1(FileHelper.scala:19)
[error] 	at com.codacy.api.helpers.FileHelper$.$anonfun$withCommit$2(FileHelper.scala:34)
[error] 	at scala.Option.map(Option.scala:146)
[error] 	at com.codacy.api.helpers.FileHelper$.withCommit(FileHelper.scala:33)
[error] 	at com.codacy.api.helpers.FileHelper$.withTokenAndCommit(FileHelper.scala:18)
[error] 	at com.codacy.CodacyCoveragePlugin$.com$codacy$CodacyCoveragePlugin$$codacyCoverageCommand(CodacyCoveragePlugin.scala:67)
[error] 	at com.codacy.CodacyCoveragePlugin$AutoImport$.$anonfun$baseSettings$1(CodacyCoveragePlugin.scala:34)
[error] 	at com.codacy.CodacyCoveragePlugin$AutoImport$.$anonfun$baseSettings$1$adapted(CodacyCoveragePlugin.scala:31)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:40)
[error] 	at sbt.std.Transform$$anon$4.work(System.scala:67)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:269)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error] 	at sbt.Execute.work(Execute.scala:278)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:269)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:178)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:37)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error] 	at java.lang.Thread.run(Thread.java:748)
[error] (codacyCoverage) java.lang.NoSuchMethodError: io.circe.JsonObject.fields()Lscala/collection/immutable/Vector;
[error] Total time: 0 s, completed Oct 21, 2018 4:07:26 PM
```

# What should happen:

Comment out addSbtPlugin("net.lullabyte" % "sbt-chrome-plugin" % "2322da3adcc7be79da5db8ca4ab5c566fb2659e9") from project/plugins.sbt to see.

```
[error] java.io.FileNotFoundException: /Users/erik/Projects/codacy-repro/target/scala-2.12/coverage-report/codacy-coverage.json (No such file or directory)
[error] 	at java.io.FileOutputStream.open0(Native Method)
[error] 	at java.io.FileOutputStream.open(FileOutputStream.java:270)
[error] 	at java.io.FileOutputStream.<init>(FileOutputStream.java:213)
[error] 	at java.io.FileOutputStream.<init>(FileOutputStream.java:162)
[error] 	at java.io.PrintWriter.<init>(PrintWriter.java:263)
[error] 	at com.codacy.api.helpers.FileHelper$.writeJsonToFile(FileHelper.scala:50)
[error] 	at com.codacy.CodacyCoveragePlugin$.$anonfun$codacyCoverageCommand$9(CodacyCoveragePlugin.scala:73)
[error] 	at com.codacy.api.helpers.FileHelper$.$anonfun$withTokenAndCommit$3(FileHelper.scala:21)
[error] 	at scala.Option.map(Option.scala:146)
[error] 	at com.codacy.api.helpers.FileHelper$.$anonfun$withTokenAndCommit$1(FileHelper.scala:19)
[error] 	at com.codacy.api.helpers.FileHelper$.$anonfun$withCommit$2(FileHelper.scala:34)
[error] 	at scala.Option.map(Option.scala:146)
[error] 	at com.codacy.api.helpers.FileHelper$.withCommit(FileHelper.scala:33)
[error] 	at com.codacy.api.helpers.FileHelper$.withTokenAndCommit(FileHelper.scala:18)
[error] 	at com.codacy.CodacyCoveragePlugin$.com$codacy$CodacyCoveragePlugin$$codacyCoverageCommand(CodacyCoveragePlugin.scala:67)
[error] 	at com.codacy.CodacyCoveragePlugin$AutoImport$.$anonfun$baseSettings$1(CodacyCoveragePlugin.scala:34)
[error] 	at com.codacy.CodacyCoveragePlugin$AutoImport$.$anonfun$baseSettings$1$adapted(CodacyCoveragePlugin.scala:31)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:40)
[error] 	at sbt.std.Transform$$anon$4.work(System.scala:67)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:269)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error] 	at sbt.Execute.work(Execute.scala:278)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:269)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:178)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:37)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error] 	at java.lang.Thread.run(Thread.java:748)
[error] (codacyCoverage) java.io.FileNotFoundException: /Users/erik/Projects/codacy-repro/target/scala-2.12/coverage-report/codacy-coverage.json (No such file or directory)
```

# What's going on

sbt-codacy-coverage is bringing in circe 0.7.0 via rapture. `sbt-chrome-plugin` is bringing in circe 0.9.1, which isn't binary compatible 
with 0.7.0 and therefore breaks the build. 

In an ideal scenario sbt-codacy-coverage would keep up to date with circe releases, shade the dependency, or drop it entirely.
