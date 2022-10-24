package com.pds.sgg.entity;

import java.util.List;

public interface UnidadeHospitalar {
    public Long getId();
    public List<Long> getIdsPacientes();
    public void setId(Long id);
    public void setIdsPacientes(List<Long> idsPacientes);
}
