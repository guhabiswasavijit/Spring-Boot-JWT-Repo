FROM dockette/jdk8:latest
LABEL maintainer="Avijit GuhaBiswas <guhabiswas.avijit@gmail.com>"
LABEL name="admin/spring-boot-jwt"

RUN apk add --no-cache bash wget openssh-server openssh-client vim sudo curl tar openrc\
    && adduser --disabled-password --home /home/admin --shell /bin/bash admin\
	&& echo 'admin ALL=(ALL) NOPASSWD:ALL' >>/etc/sudoers
	
USER admin
RUN mkdir -p /home/admin/JavaApps
ADD target/ImageStorge-0.0.1-SNAPSHOT.jar ImageStorge.jar

ENTRYPOINT ["java","-jar","ImageStorge.jar"]