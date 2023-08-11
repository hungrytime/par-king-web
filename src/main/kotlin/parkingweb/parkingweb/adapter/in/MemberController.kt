package parkingweb.parkingweb.adapter.`in`

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class MemberController {

    @GetMapping("/login")
    fun login(): String {
        return "login"
    }

    @PostMapping("/sign-in")
    fun signIn(): String {
        return "login"
    }
}