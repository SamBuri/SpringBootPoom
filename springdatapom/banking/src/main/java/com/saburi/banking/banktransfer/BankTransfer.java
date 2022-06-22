/*
 Sam Buriima
generated by Saburi Tools
*/
package com.saburi.banking.banktransfer;

 import java.util.Objects;
 import javax.persistence.Column;
 import javax.persistence.Entity;
  import javax.persistence.Table;
 import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import com.saburi.root.entities.DBEntityIncID;
import com.saburi.root.dtos.ResponseData;
import javax.validation.constraints.NotNull;
import com.saburi.root.enums.BankAccountTypes;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.OneToOne;
import com.saburi.banking.bankaccount.BankAccount;
import javax.validation.constraints.Size;


@Entity

@Table(name = "banktransfers")
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class BankTransfer extends DBEntityIncID<Integer> implements ResponseData{

@NotNull(message =  "The field: From Account Type cannot be null")
@Enumerated(EnumType.STRING)
@Column(length = 100)private BankAccountTypes fromAccountType;
@NotNull(message =  "The field: From Account No cannot be null")
@OneToOne
@JoinColumn(name = "fromAccountNoId",foreignKey = @ForeignKey(name = "fkFromAccountNoIdBankTransfer"))private BankAccount fromAccountNo;
@Size(max =  100, message =  "The field: From Account Name size cannot be greater than 100")
@Column(length =  100)
private String fromAccountName;
private String fromCurrencyId;
@Size(max =  100, message =  "The field: From Currency size cannot be greater than 100")
@Column(length =  100)
private String fromCurrency;
@NotNull(message =  "The field: To Account Type cannot be null")
@Enumerated(EnumType.STRING)
@Column(length = 100)private BankAccountTypes toAccountType;
@NotNull(message =  "The field: To Account No cannot be null")
@OneToOne
@JoinColumn(name = "toAccountNoId",foreignKey = @ForeignKey(name = "fkToAccountNoIdBankTransfer"))private BankAccount toAccountNo;
@Size(max =  100, message =  "The field: To Account Name size cannot be greater than 100")
@Column(length =  100)
private String toAccountName;
@Size(max =  100, message =  "The field: To Currency size cannot be greater than 100")
@Column(length =  100)
private String toCurrencyId;
private String toCurrency;
@Column(name = "exchangeRate")private double exchangeRate;
@Column(name = "amountTendered")private double amountTendered;
@NotNull(message ="The field: Amount cannot be null")
@Column(name = "amount",nullable = false)private double amount;

public BankTransfer(){
}
public  BankTransfer(BankAccountTypes fromAccountType,BankAccount fromAccountNo,String fromCurrencyId,BankAccountTypes toAccountType,BankAccount toAccountNo,String toCurrencyId,double exchangeRate,double amountTendered,double amount){
 this.fromAccountType = fromAccountType;
this.fromAccountNo = fromAccountNo;
this.fromCurrencyId = fromCurrencyId;
this.toAccountType = toAccountType;
this.toAccountNo = toAccountNo;
this.toCurrencyId = toCurrencyId;
this.exchangeRate = exchangeRate;
this.amountTendered = amountTendered;
this.amount = amount;

}

public BankAccountTypes getFromAccountType(){
 return fromAccountType;
}
public void setFromAccountType(BankAccountTypes fromAccountType){
this.fromAccountType = fromAccountType;
}public BankAccount getFromAccountNo(){
 return fromAccountNo;
}
public void setFromAccountNo(BankAccount fromAccountNo){
this.fromAccountNo = fromAccountNo;
}public String getFromAccountName(){
 return fromAccountName;
}
public void setFromAccountName(String fromAccountName){
this.fromAccountName = fromAccountName;
}public String getFromCurrencyId(){
 return fromCurrencyId;
}
public void setFromCurrencyId(String fromCurrencyId){
this.fromCurrencyId = fromCurrencyId;
}public String getFromCurrency(){
 return fromCurrency;
}
public void setFromCurrency(String fromCurrency){
this.fromCurrency = fromCurrency;
}public BankAccountTypes getToAccountType(){
 return toAccountType;
}
public void setToAccountType(BankAccountTypes toAccountType){
this.toAccountType = toAccountType;
}public BankAccount getToAccountNo(){
 return toAccountNo;
}
public void setToAccountNo(BankAccount toAccountNo){
this.toAccountNo = toAccountNo;
}public String getToAccountName(){
 return toAccountName;
}
public void setToAccountName(String toAccountName){
this.toAccountName = toAccountName;
}public String getToCurrencyId(){
 return toCurrencyId;
}
public void setToCurrencyId(String toCurrencyId){
this.toCurrencyId = toCurrencyId;
}public String getToCurrency(){
 return toCurrency;
}
public void setToCurrency(String toCurrency){
this.toCurrency = toCurrency;
}public double getExchangeRate(){
 return exchangeRate;
}
public void setExchangeRate(double exchangeRate){
this.exchangeRate = exchangeRate;
}public double getAmountTendered(){
 return amountTendered;
}
public void setAmountTendered(double amountTendered){
this.amountTendered = amountTendered;
}public double getAmount(){
 return amount;
}
public void setAmount(double amount){
this.amount = amount;
}
@Override
public boolean equals(Object o){
 if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final BankTransfer bankTransfer = (BankTransfer) o; if (this.getId() == null || bankTransfer.getId() == null) {
            return false;
        }
return this.getId().equals(bankTransfer.getId());

}
@Override
public int hashCode(){
  return Objects.hashCode(this.id);

}
 @Override
public String getDisplayKey(){
return this.fromAccountNo.getDisplayKey();
}


}
