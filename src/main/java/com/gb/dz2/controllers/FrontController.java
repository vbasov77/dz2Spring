package com.gb.dz2.controllers;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Контроллер на главную страницу.
 */

@Controller

public class FrontController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
