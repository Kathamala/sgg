package com.pds.sgg.entity;

import com.pds.sgg.Enums.TipoPaciente;

public class Medico extends Pessoa{
    private Long idPessoa;
    private TipoPaciente tipoPaciente;

    public Medico() {

    }

    public Medico(Long id, Long idUsuario, String nome, String email, String telefone, String endereco, Long idPessoa, TipoPaciente tipoPaciente) {
        super(id, idUsuario, nome, email, telefone, endereco);
        this.idPessoa = idPessoa;
        this.tipoPaciente = tipoPaciente;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public TipoPaciente getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(TipoPaciente tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }
}
