package parkingweb.parkingweb.adapter.`in`

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HelloController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }
}