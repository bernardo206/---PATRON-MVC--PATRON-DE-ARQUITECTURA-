package com.dh.clinica.odontologia.controllers;


import com.dh.clinica.odontologia.models.Odontologo;
import com.dh.clinica.odontologia.service.OdontologoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


public class OdontologoController {

  OdontologoService service = new OdontologoService();

  @GetMapping("odontologos")

    public List<Odontologo> verTodosLosOdontologos(){

      return List.of(new Odontologo(1, "Bernardo", "Estrada"));
  }


}
