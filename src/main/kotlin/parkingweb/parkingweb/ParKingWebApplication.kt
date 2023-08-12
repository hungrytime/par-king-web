package parkingweb.parkingweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ParKingWebApplication

fun main(args: Array<String>) {
	runApplication<ParKingWebApplication>(*args)
}
