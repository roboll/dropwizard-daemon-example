# Dropwizard Daemon

Example app demonstrating [dropwizard-daemon](http://www.github.com/robertcboll/dropwizard-daemon).

## Usage

### Build
```
mvn package -Pdist
```
This generates a distribution package under target/{project-name}-{project-version}-dist.tar.gz.

### Running
```
cd target
tar zxf *.tar.gz
cd {project-name}-{project-version}
```

#### Start
```
bin/dropwizard-daemon-example start
```

#### Stop
```
bin/dropwizard-daemon-example stop
```
