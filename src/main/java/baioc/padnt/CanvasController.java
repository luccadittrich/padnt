package baioc.padnt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CanvasController {

    @GetMapping("/desenhar")
    public String desenhar() {
        return "canvas"; // Renderiza o arquivo src/main/resources/templates/canvas.html
    }
    @GetMapping("/draw")
    public String teste() {
        return "canvas"; // Renderiza o arquivo src/main/resources/templates/canvas.html
    }
}
