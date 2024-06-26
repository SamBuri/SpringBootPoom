/*
 Sam Buriima
generated by Saburi Tools
*/
package com.saburi.sales.writeoff.dtos;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import com.saburi.sales.enums.WriteOffTypes;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.ArrayList;
import com.saburi.sales.writeoffinvoice.WriteOffInvoice;


public class WriteOffRequest{

@NotNull(message ="The field: Write Off Date cannot be null")
private LocalDate writeOffDate;
@NotNull(message =  "The field: Customer Id cannot be null")
private String customerId;
private WriteOffTypes writeOffReason;
private double amountTendered;
private String currencyId;
private double exchangeRate;
private double changeGiven;
private double amount;
@Size(max =  100, message =  "The field: AmountWords size cannot be greater than 100")
private String amountWords;
private boolean bLPostStatus;
private boolean clPostStatus;
private boolean glPostStatus;
private List<WriteOffInvoice> writeOffInvoices = new ArrayList<>();

public WriteOffRequest(){
}
public  WriteOffRequest(LocalDate writeOffDate,String customerId,WriteOffTypes writeOffReason,double amountTendered,String currencyId,double exchangeRate,double changeGiven,double amount,String amountWords,boolean bLPostStatus,boolean clPostStatus,boolean glPostStatus){
 this.writeOffDate = writeOffDate;
this.customerId = customerId;
this.writeOffReason = writeOffReason;
this.amountTendered = amountTendered;
this.currencyId = currencyId;
this.exchangeRate = exchangeRate;
this.changeGiven = changeGiven;
this.amount = amount;
this.amountWords = amountWords;
this.bLPostStatus = bLPostStatus;
this.clPostStatus = clPostStatus;
this.glPostStatus = glPostStatus;

}

public LocalDate getWriteOffDate(){
 return writeOffDate;
}
public void setWriteOffDate(LocalDate writeOffDate){
this.writeOffDate = writeOffDate;
}public String getCustomerId(){
 return customerId;
}
public void setCustomerId(String customerId){
this.customerId = customerId;
}public WriteOffTypes getWriteOffType(){
 return writeOffReason;
}
public void setWriteOffType(WriteOffTypes writeOffReason){
this.writeOffReason = writeOffReason;
}public double getAmountTendered(){
 return amountTendered;
}
public void setAmountTendered(double amountTendered){
this.amountTendered = amountTendered;
}public String getCurrencyId(){
 return currencyId;
}
public void setCurrencyId(String currencyId){
this.currencyId = currencyId;
}public double getExchangeRate(){
 return exchangeRate;
}
public void setExchangeRate(double exchangeRate){
this.exchangeRate = exchangeRate;
}public double getChangeGiven(){
 return changeGiven;
}
public void setChangeGiven(double changeGiven){
this.changeGiven = changeGiven;
}public double getAmount(){
 return amount;
}
public void setAmount(double amount){
this.amount = amount;
}public String getAmountWords(){
 return amountWords;
}
public void setAmountWords(String amountWords){
this.amountWords = amountWords;
}public boolean isBLPostStatus(){
 return bLPostStatus;
}
public void setBLPostStatus(boolean bLPostStatus){
this.bLPostStatus = bLPostStatus;
}public boolean isClPostStatus(){
 return clPostStatus;
}
public void setClPostStatus(boolean clPostStatus){
this.clPostStatus = clPostStatus;
}public boolean isGlPostStatus(){
 return glPostStatus;
}
public void setGlPostStatus(boolean glPostStatus){
this.glPostStatus = glPostStatus;
}public List<WriteOffInvoice> getWriteOffInvoices(){
 return writeOffInvoices;
}
public void setWriteOffInvoices(List<WriteOffInvoice> writeOffInvoices){
this.writeOffInvoices = writeOffInvoices;
}


}
