package com.catalisa.darkSideBooks.controller;

import com.catalisa.darkSideBooks.model.LivroModel;
import com.catalisa.darkSideBooks.service.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class LivrosController {

    @Autowired
    LivrosService livrosService;

    @GetMapping(path = "/livros")
    public List<LivroModel> buscaTodosLivros(){
        return livrosService.buscarTodos();
    }

    @GetMapping(path = "/livros/{id}")
    public Optional<LivroModel> buscarLivroPorId(@PathVariable Long id){
        return livrosService.buscarPorId(id);
    }

    @PostMapping(path = "/livros")
    @ResponseStatus(HttpStatus.CREATED)
    public LivroModel cadastrarNovoLivro(@RequestBody LivroModel livroModel){
        return livrosService.cadastrar(livroModel);
    }

    @PutMapping(path = "/livros/{id}")
    public LivroModel alteraDados(@PathVariable Long id,
                                  @RequestBody LivroModel livroModel){
        return livrosService.alterar(id, livroModel);
    }

    @DeleteMapping(path = "/livros/{id}")
    public void deletaLivro(@PathVariable Long id){
        livrosService.deletar(id);
    }

}
