package br.com.crudEscola.crudEscola.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Escola")
@CrossOrigin(origins = "*", maxAge = 3600)
public class EscolaController {

}
