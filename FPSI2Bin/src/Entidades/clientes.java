package Entidades;
import Entidades.Produto;

public class clientes {
	private int id;
	private String desc;
	private int qtd_cons;
	private int id_prods;
	
	public int getId() {return id;}
	public String getDesc() {return desc;}
	public int getQtd() {return qtd_cons;}
	
	public void setId(int id) {this.id=id;}
	public void setDesc(String s) {this.desc=s;}
	public void setQtd(int qt) {this.qtd_cons=qt;}
	

	public int getProds() {return id_prods;}
	
	public void setProds(int id) {id_prods=id;}
	public void Clientes()
	{
		
	}
	
	@Override
	public String toString() {
		return "CLIENTE - ID : "+id+" desc " + desc +" qtd cons" + qtd_cons +" id prods " + id_prods+"\n";
	}
	
	public void Clientes(Produto p, int id, String desc, int qtd_cons)
	{
		this.id_prods=p.getId();
		this.id=id;
		this.desc=desc;
		this.qtd_cons=qtd_cons;
	}

}
