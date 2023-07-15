package library;
class LibMngmnt {
    int bookId;
	String title;
	int year;
	public int getId()
	{
		return bookId;
		
	}
	public void setID(int id) {
		bookId = id;
	}
}
class book extends LibMngmnt{
	String author;
	public void author(String author) {
		System.out.println(author);
	}
}
class magazine extends LibMngmnt{
	int issue;
	public void issue(int issue) {
		System.out.println(issue);
	}
public class  libItem{
public static void main(String[] args) {
	magazine lib = new magazine();
	lib.setID(20);
	lib.title = "EM";
	lib.year = 2002;
	System.out.println(lib.getId());
	System.out.println(lib.title);
	System.out.println(lib.year);
	lib.issue(50);
	
	book lib1 = new book();
	lib1.setID(67);
	
	lib1.title = "EM";
	lib1.year = 2002;
	 
	System.out.println("lib.getId");
	System.out.println("lib.title");
	System.out.println("lib.year");
	lib1.author("abc");
}
		
}

}
