
public class Customer {
	
	private int numberOfBook;
	private Book[] books= new Book[1]; 
	
	public Customer(String name) {
		this.name=name;
		this.numberOfBook=0;

	}
	private String name;
	public String getname(){
		return name;
	}
	public int getNumberOfBook(){
		return numberOfBook;
	}
	public void buyBook(Book book){
		this.maxBooks();
		books[numberOfBook]=book;
		numberOfBook++;
	} 
	public float totalPrice(){
		float tp = 0f;
		for (int i=0; i<numberOfBook; i++){
			tp += books[i].getPrice();
		}
		return tp;
	}
	public void maxBooks(){
		if (numberOfBook>=books.length){
			 Book[] books2=new Book[books.length+1];
			 for (int j=0; j<books.length; j++){
				 books2[j]=books[j];
			 }
			 this.books=books2;
		}
	}
	
	
	public static void main(String[] args) {
		Customer a=new Customer("Amanda");
		Book b=new Book("WOW",2.3f);
		Book c=new Book("Java", 2.0f);
		a.buyBook(b);
		a.buyBook(c);
		
		System.out.println("Purchased " + a.getNumberOfBook() + " books, which cost $"+ a.totalPrice());
	}

}
