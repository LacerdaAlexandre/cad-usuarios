package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import model.Telefone;
import model.Usuario;

@Named
@SessionScoped
public class TelefoneMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Telefone telefone;
	
	private List<Telefone> telefones = new ArrayList<>();
	
	public String adicionar() {
		
		telefones.add(telefone);
		
		cleanner();
		
		return null;
	}
	
	private void cleanner() {
		telefone = new Telefone();
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	

	
	
}
