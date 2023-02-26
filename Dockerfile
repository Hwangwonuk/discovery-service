FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/discoveryservice-1.0.jar DiscoveryService.jar
ENTRYPOINT ["java","-jar","DiscoveryService.jar"]

# docker image 생성
# docker build --tag hwk0173/discovery-service:1.0 .

# docker 컨테이너 생성 및 실행
# docker run -d -p 8761:8761 --network ecommerce-network
# -e "spring.cloud.config.uri=http://config-service:8888"
# --name discovery-service hwk0173/discovery-service:1.0
