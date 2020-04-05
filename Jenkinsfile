#!groovy

@Library('jenkinslib') _

def tools = new org.devops.tools()

String workspace = "/opt/jenkins/workspace"
pipeline{
    agent { node { label "master" 
                        customWorkspace "${workspace}"
            }
    }
        
    options {
        timestamps()
        skipDefaultCheckout() 
        disableConcurrentBuilds()
        timeout(time: 1, unit: 'HOURS')
    
    }
    
    stages {
        //下载代码
        stage("GetCode") {
            steps{
                timeout(time:5, unit:"MINUTES") { 
                    script{
                        println('获取代码 ')
                    }
                }
            }
        }
        //构建
        stage("Build"){
            steps{
                timeout(time:20, unit:"MINUTES"){
                    script{
                        println('应用打包')
                    }
                }
            }
        }
		//代码扫描
        stage("CodeScan"){
            steps{
                timeout(time:20, unit:"MINUTES"){
                    script{
                        println('代码扫描')
						tools.Println("this is my lib")
                    }
                }
            }
        }
    }
    
    
    post {
        always {
            script{
                println("always")
            }
        }
        success {
            script{
                currentBuild.description += "\n构建成功！"
            }
        }
        failure {
            script{
                currentBuild.description += "\n构建失败！"
            }
        }
        aborted {
            script{
                currentBuild.desrciption += "\n构建取消！"
            }
        }
    }
}
