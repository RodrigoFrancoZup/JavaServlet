package br.com.alura.banco;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.modelo.Empresa;

public class Banco {

		private static List<Empresa> empresas = new ArrayList<>();
		
		static {
			Empresa empresa = new Empresa();
			empresa.setNome("Caelum");
			Empresa empresa2 = new Empresa();
			empresa2.setNome("Alura");
			Banco.empresas.add(empresa);
			Banco.empresas.add(empresa2);
		}
		
		public List<Empresa> getAll(){
			return Banco.empresas;
		}
		
		public void add(Empresa empresa) {
			Banco.empresas.add(empresa);
		}
		
}
