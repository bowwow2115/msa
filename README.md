## Micro Service Architecture

마이크로서비스를 학습하기 위한 프로젝트입니다

프로젝트는 쇼핑몰을 백엔드만 구현했으며 mas기반으로 구성되어있습니다
각 도메인을 클라우드서버로 나눈 것 뿐만 아니라 kafka를 통한 데이터 동기화 및 Sleuth를 통한 분산추적, Prometheus와 Grafana를 통한 모니텅링 을 학습했습니다.

* 서버구성
  * kafka
  * zookeeper
  * zipkin
  * prometheus
  * rabbitmq
  * ecommerce-server(클라우드서버)
  * apigateway-service(게이트웨이)
  * config-server(환경설정서버)
  * user-service(유저도메인)
  * order-service(주문도메인)
  * catalog-service(카탈로그도메인)

* 사용기술
  * Spring boot 
  * Spring Cloud Gateway 
  * RabbitMQ
  * Kafka
  * JPA
  * Spring Cloud Sleuth
  * Zipkin
  * Prometheus
  * Grafana
  * Dokcer
