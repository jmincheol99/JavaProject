package chapter5.oop.good;

public class InFlexibleCompanyDemo {
    public static void main(String[] args) {
    	//Employee e = new Employee();
    	Employee mereClerk1 = new MereClerk("철수", 100);
    	Employee mereClerk2 = new MereClerk("영희", 100);
    	
    	Employee manager = new Manager("홍길동", 200, "인사부"); //(1) List list = new ArrayList();
    	Manager manager2 = new Manager("둘리", 300, "개발부"); //(2) ArraryList list2 = new ArrayList();
    	//(2)는 (1)과 비교해서 고유하게 갖고 있는 "department"까지 불러올 수 있는 특성이 있다.
    	
    	//Employee 타입 
    	System.out.println(manager.getName() + " " + manager.getSalary());
    	//Manager 타입
    	System.out.println(manager2.getName() + " " + manager2.getSalary() + " " + manager2.getDepartment());
    	
    	
//        MereClerk mereClerk1 = new MereClerk("철수", 100);
//        MereClerk mereClerk2 = new MereClerk("영희", 100);
//        Manager manager = new Manager("홍길동", 200);

        
        
        System.out.println("현재 월급입니다.");
        
        System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");
        System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
        System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");

        System.out.println("");
        
        
        System.out.println("올린 후의 월급입니다.");
        
        mereClerk1.manageSalary(10);
        System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");
        
        mereClerk2.manageSalary(10);
        System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
        
        manager.manageSalary(10);
        System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");
        
   }
}

