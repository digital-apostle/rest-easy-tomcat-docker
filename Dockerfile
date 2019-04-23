# Pull base image
#From tomcat:latest

FROM tomcat:8-jre8
# Maintainer
MAINTAINER "darren.kabengele@allianz.co.uk"

RUN rm /usr/local/tomcat/conf/web.xml

# Copy to images tomcat path
ADD src/main/webapp/WEB-INF/web.xml /usr/local/tomcat/conf/
ADD target/uk-allianz-apigee-crp-rest-svc-v1-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]