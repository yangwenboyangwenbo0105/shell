#!/bin/bash
case $1 in
"start"){
	/home/yang/bin/hdp.sh start
	/home/yang/bin/zk.sh start
	/home/yang/bin/kfk.sh start
	sleep 4;
	/home/yang/bin/flu2.sh start
	/home/yang/bin/flu.sh start
	
	

};;
"stop"){
	/home/yang/bin/flu.sh stop
	/home/yang/bin/flu2.sh stop
	/home/yang/bin/kfk.sh stop
	sleep 2;
	/home/yang/bin/hdp.sh stop
	/home/yang/bin/zk.sh stop

};;
esac
