package pereira.vinicio.marcos.JavaOO.controller.lists;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/listas")
@CrossOrigin
public class ListasController {

    @GetMapping(value = "/salarios-beneficios")
    public String salariosBeneficios(){
        return "Lista Salarios Benefícios";
    }

}