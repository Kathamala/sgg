package com.pds.sgg.entity.pessoa.paciente;

public class Paciente {
    private Long id;
    private Long idPessoa;
    private TipoPaciente tipoPaciente;

    public Paciente(Long id, Long idPessoa, TipoPaciente tipoPaciente) {
        this.id = id;
        this.idPessoa = idPessoa;
        this.tipoPaciente = tipoPaciente;
    }

    public Long getId() {
        return id;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public TipoPaciente getTipoPaciente() {
        return tipoPaciente;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public  void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public void setTipoPaciente(TipoPaciente tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }
}
