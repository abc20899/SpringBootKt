package cn.junechiu.learn.controller

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by android on 2018/3/31.
 */

@SpringBootApplication
@RestController
class HelloController {

    @RequestMapping("/")
    fun index(): String {
        return "hello springboot 2.0"
    }
}

