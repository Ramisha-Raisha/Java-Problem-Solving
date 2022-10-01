public class Main {


    public static void main(String[] args) {

        /////////////Book Class///////////////////
		
        System.out.println(".........Book Class.......");
        Book Book1 = new Book("Bangla", "Ananda", "100", "Grammar", 100);
        Book Book2 = new Book("English", "Riya", "101", "Grammar", 102);
        Book Book3 = new Book("Math", "Raisha", "103", "Algebra", 103);

        Book1.ShowBookInfo();
        Book2.ShowBookInfo();
        Book3.ShowBookInfo();

        Book book = new Book();
        book.AddBookCopy(Book1.getbookCopy() + Book2.getbookCopy() + Book3.getbookCopy());
	Book.showTotalBookInfo();
	
	  /////////////Contact Class///////////////////
	  
	  System.out.println("\n.........Contact.......");
	  Contact Contact1 = new Contact("Raiyan", "2210", 22, "01702332333", 'F' );
	  Contact Contact2 = new Contact("Raihan", "2211", 29, "0158233233300", 'M' );
	  
	  Contact1.ShowPersonInfo();
	  Contact1.DetectMobileOperator();
	  Contact2.ShowPersonInfo();
	  Contact2.DetectMobileOperator();
	  
	  /////////////Mobile Class///////////////////
	  
	  System.out.println("\n.........Mobile.......");
	  
	    Mobile Mobile1 = new Mobile("Raisha","01309872398",30,"Android",false );
        Mobile Mobile2 = new Mobile("Shadhin","01898723922",30,"IOS",true );

	    Mobile1.ShowInfo();
        Mobile1.Recharge(20);
        Mobile1.CallSomeone(4);
		System.out.println("Mobile Balance: "+Mobile1.getmobileBalance()+"\n          "); 

        
        //Mobile1.Recharge(20);
        //Mobile1.CallSomeone(4);

        Mobile2.ShowInfo();
        Mobile2.Recharge(20);
        Mobile2.CallSomeone(4);
	  
	  
	  
	  
	}}