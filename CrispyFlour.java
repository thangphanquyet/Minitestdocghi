import java.time.LocalDate;

public class CrispyFlour extends Material {
    double quantity;
    public CrispyFlour(){
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public LocalDate getExpiryDate(){
        return manufacturingDate.plusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }

}