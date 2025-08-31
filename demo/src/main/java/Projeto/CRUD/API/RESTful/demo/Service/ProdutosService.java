package Projeto.CRUD.API.RESTful.demo.Service;

import Projeto.CRUD.API.RESTful.demo.Model.Produtos;
import Projeto.CRUD.API.RESTful.demo.Repository.ProdutosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {
    @Autowired
    private ProdutosRepositorio crud;

    //metodo pra cadastrar produto
    public Produtos cadastrarProduto(Produtos p){
        return crud.save(p);
    }
    //metodo pra listar os produtos
    public List<Produtos> listarProdutos(){
        return crud.findAll();

    }
    //metodo pra achar produto por Id
    public Produtos acharProdutoPorId(Long id){
        return crud.findById(id).orElseThrow(() -> new RuntimeException("Não existe o produto."));

    }
    //metodo pra atualizar produto
    public Produtos atualizarProduto(Long id, Produtos atualizacoes){
        Produtos produto = crud.findById(id).orElseThrow(() -> new RuntimeException("Não existe o produto."));

        produto.setNome(atualizacoes.getNome());
        produto.setPreco(atualizacoes.getPreco());
        return crud.save(produto);

    }
    //metodo pra deletar produto
    public void deletarProduto(Long id){
         crud.deleteById(id);
    }
}
