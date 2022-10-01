public class Book{
	private String bookName;
	private String bookAuthor;
    private String bookId; 
    private String bookType; 
	private int bookCopy;
	//private int AddbookCopy;
	public static int bookCounter=0;
	public Book(){}
	public Book(String bn,String ba,String bi,String bt,int bc){
		bookName=bn;
		bookAuthor=ba;
		bookId=bi;
		bookType=bt;
		bookCopy=bc;
		Book.bookCounter++;
	}
	static void showTotalBookInfo() {
		System.out.println("Total Book: "+Book.bookCounter); //WILL UPDATE AFTER ADDING ANY TYPE OF BOOK//
	}
	public void setBookName(String bn) {
        bookName = bn;
    }

	public String getBookName() {
        return bookName;
    }
   public void setBookAuthor(String ba) {
        bookAuthor = ba;
    }
	public String getBookAuthor() {
        return bookAuthor;
    }
	public void setbookId(String bi) {
        bookId = bi;
    }
	public String getbookId() {
        return bookId;
    }
	public void setbookType(String bt) {
        bookId = bt;
    }
	public String getbookType() {
        return bookType;
    }
	public void setbookCopy(int bc){
        bookCopy = bc;
    }
	public int getbookCopy() {
        return bookCopy;
    }
	void ShowBookInfo() {
	System.out.println("Name: " + getBookName() +"\nAuthor: " + getBookAuthor() +"\nBook ID: " + getbookId() +"\nBook Type: " + getbookType()+"\nBook Copy: " +
	getbookCopy()+"\n           ");}
	public void AddBookCopy(int x){
		
		
		System.out.println("Added copies of Book: " + x);
		
		
	}
	}
	
