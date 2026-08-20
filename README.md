# Discovery Server

A minimal Eureka service registry for the Gym CRM microservices ecosystem (`gym-crm` main service +
`trainer-workload-service`).

## Tech Stack

- Java 25
- Spring Boot 4
- Spring Cloud Netflix Eureka Server (Spring Cloud 2025.1.2)

## Getting Started

```bash
./gradlew bootRun
```

Dashboard: `http://localhost:8761`

## Registering a client service

Any service that wants to be discoverable should add
`spring-cloud-starter-netflix-eureka-client` and configure:

```yaml
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
```

## Notes

This is a single-node registry intended for local/dev use. `eureka.server.enable-self-preservation` is disabled here to
avoid noisy "renewals are lower than expected" warnings with only a couple of registered instances. Re-enable it for a
production-like multi-instance deployment.
