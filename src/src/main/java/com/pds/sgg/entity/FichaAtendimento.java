package com.pds.sgg.entity;

import java.util.List;

public class FichaAtendimento {
    private Long id;
    private Long idPaciente;
    private Long idMedico;
    private Long idEspecialidade;
    private Long idConsulta;
    private String anotacoes;
    private List<Exame> examesPrescritos;

    public FichaAtendimento(Long id, Long idPaciente, Long idMedico, Long idEspecialidade, Long idConsulta, String anotacoes) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.idEspecialidade = idEspecialidade;
        this.idConsulta = idConsulta;
        this.anotacoes = anotacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public Long getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(Long idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public void addExame(Exame exame){
        examesPrescritos.add(exame);
    }


}
