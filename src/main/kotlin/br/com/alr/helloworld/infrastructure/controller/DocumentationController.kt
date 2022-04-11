package br.com.alr.helloworld.infrastructure.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import org.springframework.web.servlet.view.RedirectView

@Controller
@RequestMapping("/")
class DocumentationController {

    @GetMapping
    fun openApi(attributes: RedirectAttributes): RedirectView {
        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView")
        attributes.addFlashAttribute("attribute", "redirectWithRedirectView")
        return RedirectView("swagger-ui/index.html")
    }
}