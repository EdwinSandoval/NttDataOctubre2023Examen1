package com.nttdata.empresa.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class EmpresaDto implements Serializable {

  private String razonSocial;

  private String ruc;

  private String representante;

  @JsonProperty("fecha_creacion")
  private Date fechaCreacion;

  private String port;

  private String mensaje;

  public EmpresaDto(String mensaje) {
    this.mensaje = mensaje;
  }
}
