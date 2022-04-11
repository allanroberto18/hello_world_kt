package br.com.alr.helloworld.infrastructure.controller

import br.com.alr.helloworld.service.model.Person
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hello")
class GreetingsController {

    @GetMapping("/{name}/{lastName}")
    @ResponseStatus(HttpStatus.OK)
    fun helloSir(
            @PathVariable(name = "name") name: String,
            @PathVariable(name="lastName") lastName: String
    ): Person {
        return Person(name, lastName)
    }
}

