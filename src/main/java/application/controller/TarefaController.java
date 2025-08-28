package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {
    @RequestMapping("/list")
    public String list() {
        return "list";
    }
}
