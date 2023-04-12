import java.math.BigDecimal;

public class UserWithAccount {
    private String login;
    private String email;
    private String account_number;
    private BigDecimal currency;

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getAccount_number() {
        return account_number;
    }

    public BigDecimal getCurrency() {
        return currency;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setCurrency(BigDecimal currency) {
        this.currency = currency;
    }

    public UserWithAccount() {
    }

    @Override
    public String toString() {
        return "UserWithAccount{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", account_number='" + account_number + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
    public String pPrint() {
        return "login = " + getLogin() + "\n" +
                "currency = " + getCurrency();
    }
}