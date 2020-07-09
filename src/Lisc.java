
public class Lisc implements Drzewo{
	
	public String toString(){
		return "";
	}
	
	public boolean czyJest(int i){return false;}
	
	public boolean czyPuste(){return true;}
	
	public int suma(){return 0;}
	
	public Drzewo dodaj(int i){
		return new Wierzcholek(i, this, this);
	}	
}
