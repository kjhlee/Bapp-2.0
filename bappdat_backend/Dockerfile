FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN ./mvnw clean install -DskipTests

CMD ["./mvnw", "spring-boot:run"]
