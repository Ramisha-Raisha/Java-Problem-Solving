public class Mobile{
private String mobileOwnerName;
private String mobileNumber; // SIM number 
private double mobileBalance; 
private String mobileOSName; 
private boolean lock;


public Mobile(){}
public Mobile(String n, String num, double bln, String os, boolean l){
	mobileOwnerName=n;
	mobileNumber=num;
	mobileBalance=bln;
	mobileOSName=os;
	lock=l;    }
	
	public void setmobileOwnerName(String n) {
        mobileOwnerName = n;
    }

	public String getmobileOwnerName() {
        return mobileOwnerName;
    }
   public void setmobileNumber(String num) {
       mobileNumber = num;
    }
	public String getmobileNumber() {
        return mobileNumber;
    }
	public void setmobileBalance(double bln) {
        mobileBalance = bln;
    }
	public double getmobileBalance() {
        return mobileBalance;
    }
	public void setmobileOSName(String os) {
        mobileOSName = os;
    }
	public String getmobileOSName() {
        return mobileOSName;
    }
	public void setlock(boolean l){
        lock = l;
    }
	public boolean getlock() {
        return lock;
    }
	
    public void ShowInfo() {
		System.out.println("Mobile Owner Name: "+getmobileOwnerName()+"\nMobile Number: "+getmobileNumber()+"\nMobile Balance: "+getmobileBalance()+
		"\nMobile OS System: "+getmobileOSName()+"\nLock Status: "+getlock());
	}
	public void Recharge(int amount){
		//int a;
	
		if (lock==false) {
			System.out.println("Recharging amount: "+  amount +" tk");
            setmobileBalance(getmobileBalance() + amount);
            System.out.println("Balance After Recharge:" + getmobileBalance());
			System.out.println("Mobile Balance: "+getmobileBalance());
        }else {
            System.out.println("Couldn't recharge cuause mobile is locked!!!");
        }
	}
	
	
	void CallSomeone(int timeDuration) {
        double perMinuitCost = 0.5;
        if (lock==false) {
			System.out.println("Time Duration: "+  timeDuration +" min");
            setmobileBalance(getmobileBalance() - (timeDuration * perMinuitCost));
            System.out.println("Balance After Call: " + getmobileBalance()+" tk");
        }else {
            System.out.println("Couldn't call cause mobile is Locked!!!!!");
        }
    }


}