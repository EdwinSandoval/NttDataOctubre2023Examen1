package com.nttdata.empresa.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "tbl_empresa")
public class Empresa {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "razon_social", length = 100)
  private String razonSocial;

  private String ruc;

  private String representante;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "fecha_creacion")
  private Date fechaCreacion;

  //  @OneToMany(mappedBy = "empresa")
  //  @JsonIgnoreProperties("empresa")
  //  private List<Empleado> empleados;

  @Transient
  private String port;
}
