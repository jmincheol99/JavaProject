package workshop.account.exception;

 //Account의 잔액(balance)가 부족할 때 사용되는 사용자 정의 Exception class
public class InsufficientBalanceException extends Exception {
	//현재 잔액
	private int currentBalance;

	public InsufficientBalanceException(String message, int currentBalance) {
		//super: 부모 클래스의 생성자를 호출
		super(message);
		this.currentBalance = currentBalance;
	
	}
	
	public int getCurrentBalance() {
		return currentBalance;
	}
	
}
