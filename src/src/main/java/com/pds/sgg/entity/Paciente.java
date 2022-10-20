package com.pds.sgg.entity;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa{
    private Long idPessoa;
    private List<Long> idEspecialidades;

    public Paciente() {

    }

    public Paciente(Long id, Long idUsuario, String nome, String email, String telefone, String endereco, Long idPessoa) {
        super(id, idUsuario, nome, email, telefone, endereco);
        this.idPessoa = idPessoa;
        this.idEspecialidades = new ArrayList<>();
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public List<Long> getIdEspecialidades() {
        return idEspecialidades;
    }

    public void adicionaEspecialidade(Long id) {
        this.idEspecialidades.add(id);
    }
}
