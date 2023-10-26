package com.ciberfarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="tb_producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
	@Id
	private int id_prod;
	private int idcategoria;
	@ManyToOne
	@JoinColumn(name="idcategoria", insertable= false, updatable=false)
	private Categoria objCategoria;
}
