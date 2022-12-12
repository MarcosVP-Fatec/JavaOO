package pereira.vinicio.marcos.JavaOO.service;

import java.util.List;

import pereira.vinicio.marcos.JavaOO.model.entity.Cargo;

public interface ListasService {
    
    public List<Cargo> salariosBeneficios(String ano, String mes, Long funcionarios[]);

}
