# Spring Boot Admin dockerized

Aim of this project is to be able to run [spring-boot-admin](https://github.com/codecentric/spring-boot-admin) application as a Docker container.

Docker image is publicly available as [aetas/spring-boot-admin-docker](https://hub.docker.com/r/aetas/spring-boot-admin-docker/).

You can run spring-boot-admin in Docker with this command:

`
docker run -d -p 8080:8080 aetas/spring-boot-admin-docker:1.3.2-SNAPSHOT
`

Now just go to <http://localhost:8080> (or <http://your-docker:8080>) with your browser.
