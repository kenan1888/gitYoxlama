import java.util.Date;

public class Card {
    private Long id;
    private int cardNumber;
    private Date createdAt;
    private Date expiredAt;
    private byte cvv;

    public Card(Long id, int cardNumber, byte cvv) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Date expiredAt) {
        this.expiredAt = expiredAt;
    }

    public byte getCvv() {
        return cvv;
    }

    public void setCvv(byte cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", createdAt=" + createdAt +
                ", expiredAt=" + expiredAt +
                ", cvv=" + cvv +
                '}';
    }
}
