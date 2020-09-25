package case_study_furama.Exceptions;

public class EmailException extends Exception{
     public EmailException() {
         super("Format email must be abc@abc.");
     }
}
