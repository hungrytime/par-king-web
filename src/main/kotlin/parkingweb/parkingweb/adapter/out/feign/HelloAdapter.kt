package parkingweb.parkingweb.adapter.out.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "hello", url="localhost:8080")
interface HelloAdapter {

    @GetMapping(
        "/hello",
        produces = ["application/json"]
    )
    fun hello(): String
}