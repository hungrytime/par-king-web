package parkingweb.parkingweb.application.service

import org.springframework.stereotype.Service
import parkingweb.parkingweb.adapter.out.feign.HelloAdapter
import parkingweb.parkingweb.application.port.`in`.HelloUseCase

@Service
class HelloService(
    private val helloAdapter : HelloAdapter
) : HelloUseCase {

    override fun hello(): String {
        return helloAdapter.hello()
    }
}