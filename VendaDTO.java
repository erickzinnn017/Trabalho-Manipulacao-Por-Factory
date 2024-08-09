package br.com.projetoBiblioteca.dto;

import java.util.Date;

/**
 *
 * @author allys
 */
public class VendaDTO {

    private int id_vend, id_cli;
    private double val_venda;
    private Date dat_venda;

    public int getId_vend() {
        return id_vend;
    }

    public void setId_vend(int id_vend) {
        this.id_vend = id_vend;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public double getVal_venda() {
        return val_venda;
    }

    public void setVal_venda(double val_venda) {
        this.val_venda = val_venda;
    }

    public Date getDat_venda() {
        return dat_venda;
    }

    public void setDat_venda(Date dat_venda) {
        this.dat_venda = dat_venda;
    }

}
