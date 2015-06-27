## Spring Cloud and Netflix Micro-services Project Source Code README

### Synopsis
This is a starting multi-module project for micro-services based on Spring Cloud
and Netflix OSS. It includes a template for a multi-module Maven project. 
All modules are built as a standalone projects, i.e. with each one having a separate executable JAR file.

### Source Code
Project source code is based on Java 1.8.

### Motivation
The motivation behind this project is to provide a common template for quickly
building micro-services using Spring Cloud and Netflix OSS components. 

### Author
Project has been created by Ahmed Khattab for the initial phase.

### Contributors

### Version
Version 0.3

### Date
June 8th, 2015

### Components
The current version includes the following:

* Main project POM file
* Multi-module Maven POM files
* api (empty)
* common (empty)
* mock
  * discovery client (eureka)
  * service1
  * service2
* system
  * config-server
  * discovery-server
  * edge-server
* scripts
  * Many utility shell scripts for starting up and shutting down platform components

### Description
This is a fully functional (yet simple) version of an initial working
micro-services environment based on Spring Cloud and Netflix OSS.
It contains three mock up micro-services, exposing REST API. Those services are
very simple so that the focus is on the mechanics of the build and interaction of
all services and not on any business logic.

A discovery server (based on Netflix Eureka server) awaits clients startup. Those
clients are not micro-services only, but any clients that wish to register with
the server. Once the micro-services are started, they register with the discovery
server on their first heartbeat communication (currently set to 30 seconds). The
discovery server keeps tracks of their automatically assigned ports and exchange
meta-data identifying the micro-services (or any other clients).

An edge server (or a gateway server, reverse proxy pattern) is also included in
this build. It provides a single entry point to the micro-services environment.
It communicates with the discovery server behind the scene to locate, load-balance
and route incoming external requests to the appropriate micro-service.

### Usage and Testing
The following are useful steps to run and understand the CSP environment.
They are all executed from the <code>scripts</code> directory:

* Start up all services (including servers)
  * 0_runAll.sh
* Start up individual components
  * x_start<name-of-service>.sh (where 'x' is '1', '2', etc.)
* Shutdown all components
  * x_killAll.sh
* Communicate with discovery server (curl, browser, http clients)
  * localhost:8761
  * localhost8761:/health
  * localhost8761:/info
  * localhost8761:/eureka/apps
* Communicate with edge server (curl, browser, http clients)
  * localhost:8765/info
  * localhost:8765/health
* Call API (micro-services) through edge server
  * localhost:8765/service1/s1
  * localhost:8765/service2/s2
