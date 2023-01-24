//import Ticket.Client;

//import Ticket.Client;

public class Main {

	
	public static void main(String[] args)
	{
		//book zxc = new book();
		//Ticket client1 = new Ticket();
		//Ticket zxcv = new Ticket();
		//zxc.title = "123";
		//zxc.adding_book();
		
		//Ticket.Client [] client1 = new Ticket.Client[10];
		
		//Ticket.Client client1 = new Ticket.Client();
		
		Ticket ticket1 = new Ticket(2,"2","3",3);
		
		//Ticket.Client client1 = new Ticket.Client();
		
		book [] books = new book[10];
		for (int i = 0; i < 10; i++)
		{
			books[i]= new book();
		}
		
		System.out.print("Kol-vo: " + book.counter_books());
		books[1].adding_book();
		books[2].adding_book();
		books[3].adding_book();
		//books[1].info_book();
		//System.out.print("Kol-vo: " + book.counter_books());
		
		System.out.printf("%d", library.BooksAndJournals());
		
		
		/*
		Ticket.Client [] client1 = new Ticket.Client[10];
		for (int i = 0; i < 10; i++)
		{
			client1[i]= new Ticket.Client();
		}
		
		
		ticket1.add_ticket(3);
		ticket1.give_book(3);
		ticket1.info_client(3);
		*/
		
	}
}