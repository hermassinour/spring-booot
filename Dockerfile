FROM maven:3.8.8-eclipse-temurin-17 as build
WORKDIR /app
COPY . .
RUN MAVEN_OPTS="-Xmx1024m" mvn clean package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/springboot-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Xmx384m","-jar","/app/app.jar"]
