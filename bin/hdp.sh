#!/bin/bash
case $1 in
"start"){
	
		/opt/module/hadoop-2.7.2/sbin/start-dfs.sh
		ssh hadoop104 "/opt/module/hadoop-2.7.2/sbin/start-yarn.sh"
		/opt/module/hadoop-2.7.2/sbin/mr-jobhistory-daemon.sh start historyserver
	
};;
"stop"){
 
		/opt/module/hadoop-2.7.2/sbin/stop-dfs.sh
		ssh hadoop104 "/opt/module/hadoop-2.7.2/sbin/stop-yarn.sh"
		/opt/module/hadoop-2.7.2/sbin/mr-jobhistory-daemon.sh stop historyserver
	
};;
esac
