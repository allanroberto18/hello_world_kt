package br.com.alr.helloworld.controller

import br.com.alr.helloworld.service.model.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
@RequestMapping("/hello")
class GreetingsController {

    @GetMapping("/{name}/{lastName}")
    fun helloSir(@PathVariable(name = "name") name: String, @PathVariable(name="lastName") lastName: String): Person {
        var person = Person(name, lastName)
        return person
    }
}

