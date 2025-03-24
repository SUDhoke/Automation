package Ex_028_Exception;

public class custom_Exception_14
{
    public static void main(String[] args) {

        Bank icici = new Bank("INR",100);
        int result = icici.add_bank_name(icici);
        System.out.println(result);

    }
}

class Bank
{
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add_bank_name(Bank bankname)
    {
        if(bankname.currency.equalsIgnoreCase("INR"))
        {
            return bankname.amount + this.amount;
        }else
        {
            try {
                throw new ex("currency mismatched");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

      return 0;

    }
}

class ex extends Exception
{
    ex(String msg)
    {
        super();
    }
}