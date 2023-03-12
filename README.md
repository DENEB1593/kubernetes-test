# Kubernetes deploy

#### 쿠버네티스를 통한 어플리케이션 배포

### 환경설정
* kubectl
* minikube (local 테스트용)
* spring-boot
* docker

### 빌드/배포 명령어
    1. docker 빌드 / 배포
    mvn clean package
    docker build --tag deneb1593/kubernetes . 
    docker run -it -p --name=kubernetes 8080:8080 deneb1593/kubernetes
    
    2. kubernetes pod 생성 및 실행
    kubectl run hello-world --image deneb1593/kubernetes --port=8080
    kubectl port-forward pod/hello-word 8080:8080

* 사전에 docker login 필요
* port-forward의 경우 테스트용도