package case_study_furama.Exceptions;

public class NameException extends Exception {
    public NameException() {
         super("First character is upper case.");
    }
}
