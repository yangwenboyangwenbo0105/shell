#!/bin/bash
log_date=$1" $2"

echo $log_date

for i in hadoop102 hadoop103 hadoop104
do
        ssh -t $i "sudo date -s '$log_date'"
done

