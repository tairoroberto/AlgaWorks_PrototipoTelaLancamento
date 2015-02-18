package br.com.tairoroberto.prototipotelalancamento;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConsultaClienteFornecedorBean {
	private List<String> clienteFornecedor = new ArrayList<String>();
	
	@PostConstruct
	public void inicializar() {
		for (int i = 0; i < 10; i++) {
			clienteFornecedor.add("");
		}
	}
	
	public List<String> getClienteFornecedor() {
		return clienteFornecedor;
	}	
}
