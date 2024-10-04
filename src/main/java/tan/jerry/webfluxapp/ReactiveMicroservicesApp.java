

/**
 * © 2024 Jerry Tan. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Jerry Tan
 * ("Confidential Information"). You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms under which this software
 * was distributed or otherwise published, and solely for the prior express purposes
 * explicitly communicated and agreed upon, and only for those specific permissible purposes.
 *
 * This software is provided "AS IS," without a warranty of any kind. All express or implied
 * conditions, representations, and warranties, including any implied warranty of merchantability,
 * fitness for a particular purpose, or non-infringement, are disclaimed, except to the extent
 * that such disclaimers are held to be legally invalid.
 */


package tan.jerry.webfluxapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class ReactiveMicroservicesApp {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveMicroservicesApp.class, args);
    }
}

/**
 * A REST controller to expose reactive endpoints using Spring WebFlux.
 */
@RestController
class ReactiveController {

    /**
     * Get a reactive message.
     * @return A reactive Mono message.
     */
    @GetMapping("/reactive-message")
    public Mono<String> getReactiveMessage() {
        return Mono.just("Welcome to the Reactive Microservices with WebFlux!");
    }
}
