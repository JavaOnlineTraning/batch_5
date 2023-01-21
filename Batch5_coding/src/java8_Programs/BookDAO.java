package java8_Programs;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

		public List<Book> getBooks(){
			
			List<Book> books = new ArrayList<>();
			books.add(new Book(101,"Core java",101));
			books.add(new Book(102,"Software Testing",200));
			books.add(new Book(103,"Data Structure",300));
			books.add(new Book(104,"Progarmming",400));
			return books;
			
		}

}
