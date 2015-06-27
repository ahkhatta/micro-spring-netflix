#/bin/bash
# ---------------------------------------------------------------------------- # 
# x_killAll Bash Script                                                        #
#                                                                              #
# A utility shell script to terminate all micro-services running processes.    #
# It identifies the processes by examining if they are running using the:      #
#         "java -jar"                                                          #
# command and executing any of the jars from the 'target' build directory.     #
# This is a useful script since there's another script that starts all the     #
# micro-services in the background and it is impractical to do that for each   #
# running process.                                                             #
#                                                                              #
# Note: This script assumes that there are not other other java jars running   #
#       that don't belong to this micro-services demo, which were started up   #
#       also using the same 'java -jar target/<jar_name>'                      #
#                                                                              #
# Author: Ahmed Khattab <https://github.com/ahkhatta>                          #
# Date:   June 9th, 2015                                                       #
# ---------------------------------------------------------------------------- # 

ids=$(ps -aef | grep 'java -jar target/' | grep -v grep | awk '{print $2}')
if [[ -n $ids ]]; then
    kill $ids 2> /dev/null 
    echo "Terminated Running Processes:"
    echo $ids
else
    echo "Found no Micro-services processes running."
fi
#kill $(ps -aef|grep 'java -jar target/'|awk '{print $2}')
