package main.java.com.Stackology.Openbank.dto;
// DTOs para transferir dados entre cliente e servidor API
public class TransactionResponseDTO {
    private String originAccountNumber;
    private String destinationAccountNumber;
    private double value;

    public TransactionResponseDTO(String originAccountNumber, String destinationAccountNumber, double value) {
        this.originAccountNumber = originAccountNumber;
        this.destinationAccountNumber = destinationAccountNumber;
        this.value = value;
    }

    /**
     * Returns the account number from which the transaction originated.
     * 
     * @return the source account number
     */
    public String getOriginAccountNumber() {
        return originAccountNumber;
    }

    public void setOriginAccountNumber(String originAccountNumber) {
        this.originAccountNumber = originAccountNumber;
    }

    public String getDestinationAccountNumber() {
        return destinationAccountNumber;
    }

    public void setDestinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
