package Projeto.CRUD.API.RESTful.demo.Controller;

import Projeto.CRUD.API.RESTful.demo.Model.Produtos;
import Projeto.CRUD.API.RESTful.demo.Service.ProdutosService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    private ProdutosService service;
    @PostMapping
    public Produtos cadastrar(@RequestBody Produtos p){
        return service.cadastrarProduto(p);

    }
    @GetMapping
    public List<Produtos> listar(){
        return service.listarProdutos();

    }
    @GetMapping("/{id}")
    public Produtos acharId(@PathVariable Long id){
        return service.acharProdutoPorId(id);
    }
    @PutMapping("/{id}")
    public Produtos atualizar(@PathVariable Long id, @RequestBody Produtos atualizacoes){
       return service.atualizarProduto(id, atualizacoes);

    }
    @DeleteMapping("/{id}")

    public void deletar(@PathVariable Long id){
        service.deletarProduto(id);
    }

}
