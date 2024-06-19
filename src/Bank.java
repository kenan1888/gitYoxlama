import java.util.List;

public class Bank {
    private Long id;
    private String name;
    private List<BankBranch> bankBranch;
    private List<Eployee>eployees;

    public Bank(Long id, String name, List<BankBranch> bankBranch, List<Eployee> eployees) {
        this.id = id;
        this.name = name;
        this.bankBranch = bankBranch;
        this.eployees = eployees;
    }
}
