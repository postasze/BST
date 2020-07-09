
public class Wierzcholek implements Drzewo{
	private Drzewo lewe, prawe;
	private int k;
	public Wierzcholek(int i, Drzewo lewe, Drzewo prawe){
		k = i;
		this.lewe = lewe;
		this.prawe = prawe;
	}
	
	public boolean czyPuste() {return false;}
	
	public boolean czyJest(int i){
		if(i == this.k) return true;
		else if(i < this.k) return (this.lewe).czyJest(i);
		return (this.prawe).czyJest(i);
	}
	
	public int suma(){
		return k + (this.prawe).suma() + (this.lewe).suma();
	}
	
	public Drzewo dodaj(int i){
		Drzewo d;
		if(i < k) { this.lewe = this.lewe.dodaj(i);
			//d = (this.lewe).dodaj(i); 
			//if((this.lewe).czyPuste()) this.lewe = d; // jesli wierzcholek w n-tym wywolaniu rekurencyjnym ma po lewej stronie puste poddrzewo (lisc) to nowy wierzcholek jest dodawany z lewej strony
		}
		else { this.prawe = this.prawe.dodaj(i);
			//d = (this.prawe).dodaj(i);
			//if((this.prawe).czyPuste()) this.prawe = d; // jesli wierzcholek w n-tym wywolaniu rekurencyjnym ma po prawej stronie puste poddrzewo (lisc) to nowy wierzcholek jest dodawany z prawej strony
		} return this;
		//return d; // ta instrukcja jest potrzebna zeby funkcja zwracala obiekt klasy Drzewo 
		// instrukcja ta nie ma wplywu na dzialanie programu
	}
	
	public String toString(){
		return "" + this.lewe + this.k + " " + this.prawe;
	}
}
