public class Eployee {
    private Long id;
    private double salary;
    private String address;
    private int number;
    private String finCode;
    private Bank bank;

    public Eployee(Long id, double salary, String address, int number, String finCode) {
        this.id = id;
        this.salary = salary;
        this.address = address;
        this.number = number;
        this.finCode = finCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    @Override
    public String toString() {
        return "Eployee{" +
                "id=" + id +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", finCode='" + finCode + '\'' +
                '}';
    }

}

