package com.nttdata.empresa.service;

import com.nttdata.empresa.dto.EmpresaDto;
import com.nttdata.empresa.entity.Empresa;
import com.nttdata.empresa.repository.EmpresaRepository;
import com.nttdata.empresa.utils.Utils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

  @Autowired
  private EmpresaRepository empresaRepository;

  @Override
  public EmpresaDto registrar(EmpresaDto empresa) {
    Empresa empresaRegistered = empresaRepository.save(Utils.toEmpresa(empresa));
    return Utils.toEmpresaDto(empresaRegistered);
  }


  @Override
  public EmpresaDto buscar(Long id) {
    Optional<Empresa> empresaFound = empresaRepository.findById(id);
    return empresaFound.map(Utils::toEmpresaDto).orElse(new EmpresaDto("No se encontro registro con este ID"));
  }

  @Override
  public EmpresaDto actualizar(Long id, EmpresaDto empresaDto) {
    final EmpresaDto empresaDtoFound = this.buscar(id);
    if (Objects.nonNull(empresaDtoFound) && Objects.isNull(empresaDtoFound.getMensaje())) {
      Empresa empresaUpdate = new Empresa();
      empresaUpdate.setId(id);
      empresaUpdate.setRazonSocial(
          Objects.nonNull(empresaDto.getRazonSocial()) ? empresaDto.getRazonSocial() : empresaDtoFound.getRazonSocial());
      empresaUpdate.setRepresentante(
          Objects.nonNull(empresaDto.getRepresentante()) ? empresaDto.getRepresentante() : empresaDtoFound.getRepresentante());
      empresaUpdate.setRuc(Objects.nonNull(empresaDto.getRuc()) ? empresaDto.getRuc() : empresaDtoFound.getRuc());
      empresaUpdate.setFechaCreacion(
          Objects.nonNull(empresaDto.getFechaCreacion()) ? empresaDto.getFechaCreacion() : empresaDtoFound.getFechaCreacion());
      Empresa empresaUpdated = empresaRepository.save(empresaUpdate);
      return Utils.toEmpresaDto(empresaUpdated);
    }
    return empresaDtoFound;
  }

  @Override
  public List<EmpresaDto> listar() {
    return empresaRepository.findAll().stream().map(Utils::toEmpresaDto).collect(Collectors.toList());
  }

  @Override
  public String eliminar(Long id) {
    EmpresaDto empresaDtoFound = this.buscar(id);
    if (Objects.nonNull(empresaDtoFound)) {
      empresaRepository.deleteById(id);
      return "Deleted successfully registry";
    }
    return "No exist el registry";
  }
}
