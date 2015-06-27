curl -s -H "Accept: application/json" http://localhost:8761/eureka/apps | jq '.applications.application[] | {service: .name, ip: .instance.ipAddr, port: .instance.port."$"}'
