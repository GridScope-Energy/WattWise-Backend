package gridscope.wattwise

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WattWiseApplication

fun main(args: Array<String>) {
    runApplication<WattWiseApplication>(*args)
}
