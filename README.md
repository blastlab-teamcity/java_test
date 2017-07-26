# Java Test App

## By Maven

Run unit tests and compile app:

```bash
mvn clean package
```

Output - inside new `target` directory:

* `java-test-0.1.0.jar` - artefact, compiled app,
* `surefire-reports` - unit test results.

## By Docker

```bash
docker build -t java-test-maven .
docker run -it --rm -v "$PWD":/app java-test-maven mvn clean package
```

-----

**TODO:** maven package directory, `/root/.m2`, should be a shared volume,
to prevent pulling all dependencies every time.
See: https://docs.docker.com/engine/tutorials/dockervolumes/

It should be a docker volume, not shared with a local user `~/.m2` directory,
as the packages pulled by docker would be owned by root.