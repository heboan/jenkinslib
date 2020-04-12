package org.devops

//ansible
def AnsibleDeploy(host, func){
    sh "ansible ${func} ${host}"
}
