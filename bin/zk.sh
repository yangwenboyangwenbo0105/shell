#!/bin/bash
case $1 in
"start"){
	for i in hadoop102 hadoop103 hadoop104
	do
		echo "-----------------start zookeeper in $i--------------------"
		ssh $i "/opt/module/zookeeper/bin/zkServer.sh start"
	done
};;
"stop"){
	for i in hadoop102 hadoop103 hadoop104
	do
		echo "-----------------stop zookeeper in $i---------------------"
		ssh $i "/opt/module/zookeeper/bin/zkServer.sh stop"
	done
};;
esac
