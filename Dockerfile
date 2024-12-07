FROM open-jdk23

LABEL authors="loltoulan"

WORKDIR /app/jar

COPY dockefiledeploy.jar dockefiledeploy.jar

ENTRYPOINT ["java","-jar","dockefiledeploy.jar"]
