package br.com.alura.banco;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.modelo.Empresa;

public class Banco {

		private static List<Empresa> empresas = new ArrayList<>();
		private Integer id = 3;
		
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
		
		public List<Empresa> getAll(){
			return Banco.empresas;
		}
		
		public void add(Empresa empresa) {
			empresa.setId(id);
			Banco.empresas.add(empresa);
			id++;
		}
		
}
