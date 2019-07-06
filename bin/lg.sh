#! /bin/bash

	for i in hadoop103 hadoop104 
	do
		ssh $i "java -classpath /opt/module/houtai-1.0-SNAPSHOT-jar-with-dependencies.jar com.yang.appclient.AppMain  >/opt/module/test.log &"
	done

