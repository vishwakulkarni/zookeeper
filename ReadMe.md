#steps to setup

install java8
install maven

git clone https://github.com/vishwakulkarni/zookeeper.git

cd zookeeper
mvn clean install

java -cp target/zookeeper-1.0-SNAPSHOT.jar ooad.homework.zookeeper.Main 