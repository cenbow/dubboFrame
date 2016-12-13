#!/bin/sh
#1.注意jdk输得输出
#2.appName修改
#3.服务工程目录
## java env
export JAVA_HOME=/usr/local/jdk
export JRE_HOME=$JAVA_HOME/jre

## service name
APP_NAME=notify

SERVICE_DIR=/home/telinx/provider/$APP_NAME
SERVICE_NAME=tech-service-$APP_NAME
JAR_NAME=$SERVICE_NAME\.jar
PID=$SERVICE_NAME\.pid

cd $SERVICE_DIR

stopServer(){
    kill `cat $SERVICE_DIR/$PID`
    rm -rf $SERVICE_DIR/$PID
    echo "=== stop $SERVICE_NAME"

    sleep 5
    ##
    ## edu-service-aa.jar
    ## edu-service-aa-bb.jar
    P_ID=`ps -ef | grep -w "$SERVICE_NAME" | grep -v "grep" | awk '{print $2}'`
    if [ "$P_ID" == "" ]; then
        echo "=== $SERVICE_NAME process not exists or stop success"
    else
        echo "=== $SERVICE_NAME process pid is:$P_ID"
        echo "=== begin kill $SERVICE_NAME process, pid is:$P_ID"
        kill -9 $P_ID
     fi
}

startServer(){
    nohup $JRE_HOME/bin/java -Xms256m -Xmx512m -jar $JAR_NAME >/dev/null 2>&1 &
    echo $! > $SERVICE_DIR/$PID
    echo "=== start $SERVICE_NAME"
}

case "$1" in

    start)
        startServer
        ;;

    stop)
        stopServer
        ;;

    restart)
        $0 stop
        sleep 2
        $0 start
        echo "=== restart $SERVICE_NAME"
        ;;

    *)
        ##restart
        ##$0 stop
        ##sleep 3
        ##$0 start
        ##;;
        stopServer
        sleep 3
        startServer

esac


exit 0

