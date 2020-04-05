package org.devops

//打印内容
def Println(content){
    println(content)
}

//格式化输出
def PrintMsg(value, color){
    color = ['red'   : "\003[40;31m >>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<< \033[0m",
             'blue'  : "\003[47;34m ${value} \033[0m",
             'green' : "\033[40;32m >>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<< \033[0m"]
    ansiColor('xterm'){
        println(colors[color])
    }
}
