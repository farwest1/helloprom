FROM openjdk:alpine
VOLUME /tmp
#COPY ./target/loadb.war ${DEPLOYMENT_DIR}
#ADD ./target/loadb.war /opt/jboss/wildfly/standalone/deployments/
ADD ./target/helloprom-0.1.0.jar helloprom.jar
RUN sh -c 'touch helloprom.jar'
EXPOSE 8081 8082
LABEL maintainer="Bernd Moeller <moeller-bernd@gmx.de>"


# RUN /opt/jboss/wildfly/bin/add-user.sh admin ZR20010$%! --silent
ENTRYPOINT ["sh", "-c", "java -jar helloprom.jar"]