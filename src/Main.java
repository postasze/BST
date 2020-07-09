import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
   static int[] tab = {3, 4, 1, 8, 2, 5, 6, 2}; // Przykladowe dane

   private static void info(BST b){
        System.out.println("drzewo    = " +  b);
        System.out.println("Czy puste = " +  b.czyPuste());
        System.out.println("Suma      = " +  b.suma());
        for(int i: tab)
           System.out.println("CzyJest " + i +  " = " + b.czyJest(i));
        System.out.println("CzyJest " + 13 +  " = " + b.czyJest(13));
    }

   public static void testowanieDzialaniaProgramu(BST bst) throws IOException
	{
		char wybor;
		String s;
		BufferedReader wejscie = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("Testowanie dzialania programu. Nacisnij przycisk 1, 2, 3, 4, 5 lub 6");
			System.out.println("1 ................ dodawanie nowego elementu do drzewa");
			System.out.println("2 ................ wyszukiwanie elementu w drzewie");
			System.out.println("3 ................ sumowanie elementow w drzewie");	
			System.out.println("4 ................ sprawdzenie czy drzewo posiada jakies wierzcholki");
			System.out.println("5 ................ wypisywanie elementow drzewa w porzadku rosnacym");
			System.out.println("6 ................ koniec");	
			s = wejscie.readLine();
			wybor = s.charAt(0);
			switch (wybor){	
			case '1' : {
				System.out.println("Podaj wartosc klucza w nowym wierzcholku");
				s = wejscie.readLine();
				bst.dodaj(Integer.parseInt(s));
				System.out.println("Nowy wierzcholek zostal dodany");
			} break;

			case '2' : {
				System.out.println("Podaj liczbe ktora chcesz wyszukac w drzewie");
				s = wejscie.readLine();
				if (bst.czyJest(Integer.parseInt(s))) 
					System.out.println("Dana liczba wystepuje w drzewie");
				else System.out.println("Dana liczba nie wystepuje w drzewie");
			} break;
			
			case '3' : {
				System.out.println("Suma elementow w drzewie wynosi " + bst.suma());
			} break;
			
			case '4' : {
				if (bst.czyPuste()) 
					System.out.println("Drzewo jest puste");
				else System.out.println("Drzewo posiada wierzcholki");
			} break;
			
			case '5' : {
				System.out.println("Wypisywanie elementow drzewa w porzadku rosnacym: " + bst);
			} break;
			}
		}
		while (wybor != '6');			
	}
   
    public static void main(String[] args) throws IOException {
		System.out.println("Program - Drzewo BST");
		System.out.println("Tworzenie drzewa BST");
        BST b = new BST();

        info(b);

        for(int i: tab)
            b.dodaj(i);

        info(b);
        testowanieDzialaniaProgramu(b);
    }
}
