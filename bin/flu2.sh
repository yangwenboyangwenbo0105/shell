#!/bin/bash
case $1 in
"start"){
	echo "---------------------消费flume开启---------------------------"
	ssh hadoop102 "nohup /opt/module/flume/bin/flume-ng agent --conf-file /opt/module/flume/conf/kafka-flume-hdfs.conf --name a1 -Dflume.root.logger=INFO,LOGFILE >/opt/module/flume/log.txt   2>&1 &"
};;
"stop"){
	echo "----------------------消费flume停止---------------------------"
	ssh hadoop102 "ps -ef | grep kafka-flume-hdfs | grep -v grep |awk '{print \$2}' | xargs kill"
};;
esac
