#!/bin/sh

echo "********************************************************"
echo "Esperando pelo servidor eureka na porta $EUREKASERVER_PORT"
echo "********************************************************"
while ! `nc -z eurekaserver $EUREKASERVER_PORT`; do sleep 3; done
echo "******* Servidor eureka iniciou"

echo "********************************************************"
echo "Esperando pelo servidor de configuracao na porta $CONFIGSERVER_PORT"
echo "********************************************************"
while ! `nc -z configserver $CONFIGSERVER_PORT`; do sleep 3; done
echo "*******  Configuration Server has started"

echo "********************************************************"
echo "Iniciando Microservico BookWS                           "
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom -Dserver.port=$PORT   \
     -Deureka.client.serviceUrl.defaultZone=$EUREKA_DEFAULT_ZONE   \
     -Dspring.profiles.active=$PROFILE                             \
     -jar /usr/local/@project.artifactId@/@project.build.finalName@.jar