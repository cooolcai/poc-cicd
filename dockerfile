FROM local.harbor/test/java8-ssh:1.0.0
MAINTAINER CAI-ZHIMENG
ARG jarfile
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /eureka
COPY $jarfile /eureka/app.jar
WORKDIR /eureka

EXPOSE 1111
CMD java -jar app.jar