package parkingweb.parkingweb.adapter.`in`

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import parkingweb.parkingweb.application.port.`in`.HelloUseCase

@Controller
class HelloController(
    private val helloUseCase: HelloUseCase
) {

    @GetMapping("/hello")
    fun hello(): String {
        return helloUseCase.hello()
    }
}