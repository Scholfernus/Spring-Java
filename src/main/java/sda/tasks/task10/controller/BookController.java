package sda.tasks.task10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @RequestMapping("/{id}")
    public String getBook(@PathVariable("id") Long id) {
        // Tutaj umieść logikę pobierania książki o podanym id
        return "book"; // Zakładając, że "book.html" to nazwa twojego widoku książki w folderze "resources/templates/"
    }
}
