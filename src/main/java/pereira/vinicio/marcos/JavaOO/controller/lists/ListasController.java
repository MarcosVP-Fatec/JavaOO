package pereira.vinicio.marcos.JavaOO.controller.lists;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lista")
@CrossOrigin
public class ListasController {

    @GetMapping(value = "/salarios-beneficios")
    public String salariosBeneficios(){
        return "Lista Salarios Benefícios";
    }

    @GetMapping(value = "/salarios-no-mes")
    public String salariosNoMes(){
        return "Lista Salarios no Mês";
    }

    @GetMapping(value = "/beneficios-no-mes")
    public String beneficiosNoMes(){
        return "Lista Benefícios no Mês";
    }

    @GetMapping(value = "/maior-recebimento-no-mes")
    public String maiorRecebimentoNoMes(){
        return "Lista Maior Recebimento no Mês";
    }

    @GetMapping(value = "/maior-beneficio-no-mes")
    public String maiorBeneficioNoMes(){
        return "Lista Maior Benefício no Mês";
    }

    @GetMapping(value = "/maior-venda-no-mes")
    public String maiorVendaNoMes(){
        return "Lista Maior Venda no Mês";
    }
    

}