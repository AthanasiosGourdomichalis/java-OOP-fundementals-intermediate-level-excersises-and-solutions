class Author {
	
    private String name;
    private String country;

    Author(String name, String country){
        this.name = name;
        this.country = country;
    }
	
    public String toString(){
        return "\nAuthor's name: " + name
                + "\nAuthor's country: " + country;
    }
}


class Book {
	
	private String title;
    private Author author;

    Book(String title, Author author){
        this.title = title;
        this.author = author;
    }

    public String toString(){
        return "Book's title: " + title
                + author.toString();
    }
	
}

public class App4 {
    public static void main(String[] args) {
        
        Author author1 = new Author("J. K. Rowling", "USA");
        Author author2 = new Author("Hawking Stephen", "USA");
		
        Book book1 = new Book("Harry Potter", author1);
        Book book2 = new Book("Universe In A Nutshell", author2);

		System.out.println(book1+"\n "+book2);
        
    }
}
