# Books n Beer (Postgres)

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Launching the application with LaunchThisApp

First, ensure the package type is set to uber-jar in the src/main/resources/application.properties file:

```
quarkus.package.type=uber-jar
```

Next, package it:

```shell script
./mvnw package
```

Finally, upload the target/booksnbeer-quarkus-pg-1.0-SNAPSHOT-runner.jar file via the https://launchthis.app homepage.

## Running the application in dev mode with LaunchThisApp

First, in the src/main/resources/application.proprties file, ensure the package type is set to uber-jar and a live reload password is set:

```
quarkus.package.type=mutable-jar

quarkus.live-reload.instrumentation=true
quarkus.live-reload.password=123456
```

Next, package it:

```shell script
./mvnw package
```

Then, create an archive of the target/quarkus-app folder:

```
cd target
tar -zcvf booksnbeer-quarkus.tar.gz quarkus-app
```

Then, upload the target/booksnbeer-quarkus.tar.gz file via the https://launchthis.app homepage.

Finally, run the application locally in Quarkus remote dev mode:

```
./mvnw quarkus:remote-dev -Ddebug=false -Dquarkus.live-reload.url=https://{uuid}-launchthis.app
```
