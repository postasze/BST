
public class BST {
	Drzewo d;
	
	BST(){
		this.d = new Lisc();
	}
	
	void dodaj(int i){
		if((this.d).czyPuste()) this.d = new Wierzcholek(i, this.d, this.d); // dodawanie pierwszego wierzcholka do drzewa gdy drzewo jest puste (jest lisciem)
		else (this.d).dodaj(i);
	}
	
	int suma(){
		return d.suma();
	}
	
	boolean czyJest(int i){
		return d.czyJest(i);
	}
	boolean czyPuste(){
		return d.czyPuste();
	}
	
	public String toString(){
		if((this.d).czyPuste()) return "Drzewo jest puste";
		return "" + d;
	}
}
