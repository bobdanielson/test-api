package test.api.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/test-api/v1")
class HelloWorld {

    @Get("/hello")
    fun sayHello(): String {
        return "hello world"
    }
}
