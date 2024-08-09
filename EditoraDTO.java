package br.com.projetoBiblioteca.dto;
import java.util.Date;


public class EditoraDTO {
    private String nome_editora, cnpj_editora, tel_editora;
    private Date data_cad_editora;
    private int id_editora;

    public String getNome_editora() {
        return nome_editora;
    }

    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
    }

    public String getCnpj_editora() {
        return cnpj_editora;
    }

    public void setCnpj_editora(String cnpj_editora) {
        this.cnpj_editora = cnpj_editora;
    }

    public String getTel_editora() {
        return tel_editora;
    }

    public void setTel_editora(String tel_editora) {
        this.tel_editora = tel_editora;
    }

    public Date getData_cad_editora() {
        return data_cad_editora;
    }

    public void setData_cad_editora(Date data_cad_editora) {
        this.data_cad_editora = data_cad_editora;
    }

    public int getId_editora() {
        return id_editora;
    }

    public void setId_editora(int id_editora) {
        this.id_editora = id_editora;
    }

  
}
