package model;

import java.io.Serializable;

public class Telefone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer idUsuario;
	private int oddd;
	private String oNumero;
	private String oTipo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getOddd() {
		return oddd;
	}
	public void setOddd(int oddd) {
		this.oddd = oddd;
	}
	public String getoNumero() {
		return oNumero;
	}
	public void setoNumero(String oNúmero) {
		this.oNumero = oNúmero;
	}
	public String getoTipo() {
		return oTipo;
	}
	public void setoTipo(String oTipo) {
		this.oTipo = oTipo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	

}
