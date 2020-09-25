package case_study_furama.Exceptions;

public class GenderException extends Exception {
     public GenderException() {
        super("Gender must be Male, Female or Unknown.");
    }
}
