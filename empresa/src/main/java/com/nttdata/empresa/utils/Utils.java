package com.nttdata.empresa.utils;

import com.nttdata.empresa.dto.EmpresaDto;
import com.nttdata.empresa.entity.Empresa;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utils {

  public static Empresa toEmpresa(EmpresaDto empresaDto) {
    Empresa empresa = new Empresa();
    empresa.setRazonSocial(empresaDto.getRazonSocial());
    empresa.setRuc(empresaDto.getRuc());
    empresa.setRepresentante(empresaDto.getRepresentante());
    empresa.setFechaCreacion(empresaDto.getFechaCreacion());
    return empresa;
  }

  public static EmpresaDto toEmpresaDto(Empresa empresa) {
    final EmpresaDto empresaDto = new EmpresaDto();
    empresaDto.setRazonSocial(empresa.getRazonSocial());
    empresaDto.setRuc(empresa.getRuc());
    empresaDto.setRepresentante(empresa.getRepresentante());
    empresaDto.setFechaCreacion(empresa.getFechaCreacion());
    return empresaDto;
  }
}
