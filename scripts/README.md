1. Startup all services: 0_runAll.sh

2. Discovery server runs on port: 8761
    - localhost:8761
    - localhost8761:/health
    - localhost8761:/info
    - localhost8761:/eureka/apps

3. Edge server runs on port: 8765 
    - localhost:8765/info
    - localhost:8765/health

4. Service 1 runs on 8080/service1

5. Service 2 runs on 8080/service2

6. However, we need to access those services from the edge server:
    - curl localhost:8765/service1/s1
    - curl localhost:8765/service2/s2

7. Accessing configuration server's client configuration (fetched from github):
    - curl http://localhost:8888/config-client/master

8. Accessing configuration client's REST interfaces (configuration from server):
    - curl http://localhost:8080/project-name
    - curl http://localhost:8080/version
    - curl http://localhost:8080/lifecycle
