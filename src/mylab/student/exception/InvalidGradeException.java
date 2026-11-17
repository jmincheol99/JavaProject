package mylab.student.exception;

public class InvalidGradeException extends Exception {
    private int currentGrade;
    
    // ⭐ 문자열만 받는 생성자 추가
    public InvalidGradeException(String message) {
        super(message);
    }

    public InvalidGradeException(String message, int currentGrade) {
        super(message);
        this.currentGrade = currentGrade;
    }
 
    public int getCurrentGrade() {
        return currentGrade;
    }
}