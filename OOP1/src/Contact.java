public class Contact{
   private String personName;
   private String personId; 
   private int age; 
   private String mobileNumber; 
   private char gender;
   public Contact(){}
   public Contact(String n, String id, int a, String mnum, char g){
	   personName=n;
	   personId=id;
	   age=a;
	   mobileNumber=mnum;
	   gender=g;}
	  
	  
   /*public Sring getpersonName(){
   return personName;}*/
   public void setpersonName(String n){personName=n;}
   public String getpersonName(){
   return personName;}
   
   public void setpersonId(String id){personId=id;}
   public String getpersonId(){
   return personId;}
   //public void setpersonId(String id){personId=id;}
   
   public void setage(int a){age=a;}
   public int getage(){
   return age;}
   //public void setage(String a){age=a;}

   public void setmobileNumber(String mnum){mobileNumber=mnum;}
   public String getmobileNumber(){
   return mobileNumber;}
   //public void setmobileNumber(String mnum){mobileNumber=mnum;}
   
   public void setgender(char g){gender=g;}
   public char getgender(){
   return gender;}
   //public void setgender(Char g){gender=g;}
   
   
   public void ShowPersonInfo(){
	System.out.println("Person Name: "+getpersonName()+"\nPerson Id: "+getpersonId()+"\nAge: "+getage()+"\nMobile Number: "+getmobileNumber()+"\nGender: "+getgender());   } 
   
   
   public void DetectMobileOperator(){
	   String str=getmobileNumber();
	   int size=str.length();
	   if(size==11){
	   if(getmobileNumber().charAt(2)=='7'){
		   System.out.println("Operator:  GP"+"\n         ");
	   }
	   if(getmobileNumber().charAt(2)=='6'){
		   System.out.println("Operator:  Airtel"+"\n         ");
	   }
	   if(getmobileNumber().charAt(2)=='9'){
		   System.out.println("Operator:  Banglalink"+"\n         ");
	   }
	   if(getmobileNumber().charAt(2)=='8'){
		   System.out.println("Operator:  Robi"+"\n         ");
	   }
	   if(getmobileNumber().charAt(2)=='5'){
		   System.out.println("Operator:  Teletalk"+"\n         ");
	   }}
	   else {System.out.println("Invalid Number!!!!");}
	   
}}




































