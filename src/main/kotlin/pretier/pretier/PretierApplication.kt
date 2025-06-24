package pretier.pretier

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PretierApplication

fun main(args: Array<String>) {
	runApplication<PretierApplication>(*args)
}
