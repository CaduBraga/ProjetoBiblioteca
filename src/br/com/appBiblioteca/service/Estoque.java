package br.com.appBiblioteca.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appBiblioteca.model.Livro;
import br.com.appBiblioteca.view.Interface;

public class Estoque {
    List<Livro> estoqueLivro;
    Interface tela;

    public Estoque() {
        estoqueLivro = new ArrayList<>();
        tela = new Interface();
    }

    public Estoque(List<Livro> estoqueLivro) {
        this.estoqueLivro = estoqueLivro;
    }

    public void setlivro(List<Livro> estoqueLivro) {
        this.estoqueLivro = estoqueLivro;
    }

    public List<Livro> getEstoqueLivro() {
        return estoqueLivro;
    }

    public void gerenciarEstoque() {
        int escolhaInicial = 0;
        while (escolhaInicial != 5) {
            escolhaInicial = tela.menuPrincipal();
            switch (escolhaInicial) {

                case 1:
                    Livro livro = tela.cadastrar();
                    estoqueLivro.add(livro);
                    break;

                case 2:
                    tela.detalhar(estoqueLivro);
                    break;

                case 3:
                    tela.remover(estoqueLivro);
                    break;

                case 4:
                    tela.editar(estoqueLivro);
                    break;

                case 5:
                    tela.encerrar();
                    break;
                default:
                    System.out.println("Opção inválida. Escolha um número entre 1 e 5.");
            }
        }
    }
}