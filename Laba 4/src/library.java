import java.util.Scanner;

public class library {
	
	Scanner in = new Scanner(System.in);

	String title; //Название
	String description; //Описание
	String author; //Автор
	String date; //Дата выхода
	String style; //Жанр

	public void adding()
	{
		System.out.print("Vvedite nazvanie: ");
		title = in.nextLine();
		System.out.print("Vvedite opisanie: ");
		description = in.nextLine();
		System.out.print("Vvedite avtora: ");
		author = in.nextLine();
		System.out.print("Vvedite datu: ");
		date = in.nextLine();
		System.out.print("Vvedite zhanr: ");
		style = in.nextLine();
	}
	
	public void info()
	{
		System.out.printf("\nNazvanie: %s\n", title);
		System.out.printf("Opisanie: %s\n", description);
		System.out.printf("Avtor: %s\n", author);
		System.out.printf("Data: %s\n", date);
		System.out.printf("Zhanr: %s\n", style);
	}
	
	public void deleted()//Функция удаления
	{
		title = "";
		description = "";
		author = "";
		date = "";
		style = "";
	}
	
	public void edit()//Функция редактирования
	{
		System.out.print("\nVvedite nomer parametra dlya redaktirovaniya (1 - nazvanie, 2 - opisanie, 3 - avtor, 4 - data, 5 - zhanr): ");
		int parametr = in.nextInt();
		in.nextLine();
		
		switch (parametr)
		{
		case 1:
			System.out.print("Vvedite novoe nazvanie: ");
			title = in.nextLine();
			break;
		case 2:
			System.out.print("Vvedite novoe opisanie: ");
			description = in.nextLine();
			break;
		case 3:
			System.out.print("Vvedite novogo avtora : ");
			author = in.nextLine();
			break;
		case 4:
			System.out.print("Vvedite novuyu datu : ");
			date = in.nextLine();
			break;
		case 5:
			System.out.print("Vvedite noviy zhanr : ");
			style = in.nextLine();
			break;
		default:
			break;
		}
	}
	public static int BooksAndJournals()
	{
		books_and_journals v = new books_and_journals();
		return(v.Vozv(book.counter_books(), journal.counter_journals())-1);
	}
}