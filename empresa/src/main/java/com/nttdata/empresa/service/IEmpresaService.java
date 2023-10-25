package com.nttdata.empresa.service;

import com.nttdata.empresa.dto.EmpresaDto;
import java.util.List;

public interface IEmpresaService {

  public EmpresaDto registrar(EmpresaDto empresa);

  public EmpresaDto actualizar(Long id, EmpresaDto empresa);

  public List<EmpresaDto> listar();

  public EmpresaDto buscar(Long id);

  public String eliminar(Long id);
}
