public class Invoice {

    private final String invoiceNumber;
    private double cost;
    private boolean status;
    private String paidBy;

    public Invoice(String invoiceNumber, double cost, boolean status) {
        this.invoiceNumber = invoiceNumber;
        this.cost = cost;
        this.status = status;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }

    @Override
    public String toString() {
        return "Invoice nomeri: '"+ invoiceNumber + "\'," +
                " To`lov holati: '" + (status?"to`langan":"to`lanmagan") +"\',"+
                " To`lovchi:  '" + paidBy +"\'," +
                " Siz " + cost +
                " to`lashingiz kerak.";
    }
}
