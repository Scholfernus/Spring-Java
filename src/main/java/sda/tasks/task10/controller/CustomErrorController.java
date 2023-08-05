package sda.tasks.task10.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Tutaj możesz umieścić dodatkową logikę, jeśli chcesz, np. zapisywanie błędów do pliku dziennika
        return "error"; // Przekierowuje na widok "error.html"
    }

}
