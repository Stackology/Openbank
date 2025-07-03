package main.java.com.Stackology.Openbank.dto;
// DTOs para transferir dados entre cliente e servidor API
public class TransactionRequestDTO {
    private String originAccountNumber;
    private String destinationAccountNumber;
    private double value;
}
