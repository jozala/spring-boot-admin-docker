# Spring Boot Admin dockerized

Aim of this project is to be able to run [spring-boot-admin](https://github.com/codecentric/spring-boot-admin) application as a Docker container.

Docker image is publicly available as [aetas/spring-boot-admin-docker](https://hub.docker.com/r/aetas/spring-boot-admin-docker/).

You can run spring-boot-admin in Docker with this command:

`
docker run -d -p 8090:8080 --name spring-boot-admin aetas/spring-boot-admin-docker:1.4.1
`

Now just go to <http://localhost:8090> (or <http://your-docker:8090>) with your browser.


More detailed description in blog post [here](http://aetas.pl/?p=347).