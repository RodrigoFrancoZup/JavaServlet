package br.com.alura.banco;

import java.util.ArrayList;
import java.util.List;
import br.com.alura.modelo.Empresa;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<>();
	private static Integer id = 3;

	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Caelum");
		empresa.setId(1);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Alura");
		empresa2.setId(2);
		Banco.empresas.add(empresa);
		Banco.empresas.add(empresa2);
	}

	public List<Empresa> getAll() {
		return Banco.empresas;
	}

	public void add(Empresa empresa) {
		empresa.setId(id);
		Banco.empresas.add(empresa);
		id++;
	}

	public void remove(Integer id) {
		Empresa empresa = null;
		for (int i = 0; i < empresas.size(); i++) {
			if (empresas.get(i).getId() == id) {
				empresa = empresas.get(i);
			}
		}
		empresas.remove(empresa);
	}

	public void altera(Empresa empresaAtualizada) {
		for (Empresa empresa : empresas) {
			if (empresa.getId() == empresaAtualizada.getId()) {
				empresa.setNome(empresaAtualizada.getNome());
				empresa.setDataAbertura(empresaAtualizada.getDataAbertura());
			}
		}
	}

	public Empresa buscaEmpresa(Integer id) {
		Empresa empresa = null;
		for (int i = 0; i < empresas.size(); i++) {
			if (empresas.get(i).getId() == id) {
				empresa = empresas.get(i);
			}
		}
		return empresa;
	}

}
