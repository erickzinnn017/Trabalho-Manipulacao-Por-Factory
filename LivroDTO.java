package br.com.projetoBiblioteca.dto;

public class LivroDTO {
    private String nome_livro, isbn_livro, cod_bar_livro;
    private double p_custo_livro, p_venda_livro;
    private int id_livro;

    public String getNome_livro() {
        return this.nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getIsbn_livro() {
        return this.isbn_livro;
    }

    public void setIsbn_livro(String isbn_livro) {
        this.isbn_livro = isbn_livro;
    }

    public String getCod_bar_livro() {
        return this.cod_bar_livro;
    }

    public void setCod_bar_livro(String cod_bar_livro) {
        this.cod_bar_livro = cod_bar_livro;
    }

    public double getP_custo_livro() {
        return this.p_custo_livro;
    }

    public void setP_custo_livro(double p_custo_livro) {
        this.p_custo_livro = p_custo_livro;
    }

    public double getP_venda_livro() {
        return this.p_venda_livro;
    }

    public void setP_venda_livro(double p_venda_livro) {
        this.p_venda_livro = p_venda_livro;
    }

    public int getId_livro() {
        return this.id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    
      
}
