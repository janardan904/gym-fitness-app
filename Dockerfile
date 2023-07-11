FROM  openjdk:11

COPY  target/gym-fitness-app.jar  /user/app/

WORKDIR  /user/app/

ENTRYPOINT  ["java","-jar","gym-fitness-app.jar"]
