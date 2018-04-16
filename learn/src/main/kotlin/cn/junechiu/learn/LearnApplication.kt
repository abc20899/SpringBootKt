package cn.junechiu.learn

import cn.junechiu.learn.controller.HelloController
import org.springframework.boot.SpringApplication

fun main(args: Array<String>) {
    SpringApplication.run(HelloController::class.java, *args)
}

