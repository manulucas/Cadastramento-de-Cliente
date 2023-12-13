package monitoria_12;

import java.util.ArrayList;
import java.util.List;

public class FilaDePessoas {
	
	ArrayList<Pessoa> ps;
	
	public  FilaDePessoas() {
		
		this.ps = new ArrayList<Pessoa>();
	}
	
	public void cadastrar(Pessoa pessoa) {
				
		ps.add(pessoa);
		
	}
	
	public List<Pessoa> filaprioridade (){
		return ps.stream().filter(x->x.ePrioridade).toList();
			
	}
	
	public List<Pessoa> filacomum (){
		return ps.stream().filter(x->!x.ePrioridade).toList();
					
	}
	
	
}
