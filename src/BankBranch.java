public class BankBranch {
private Long id;
private String address;
private Bank bank;

    public BankBranch(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "BankBranch{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
