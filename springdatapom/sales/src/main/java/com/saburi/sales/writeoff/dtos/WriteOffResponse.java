package com.saburi.sales.writeoff.dtos;
import com.saburi.root.dtos.ResponseData;
import com.saburi.sales.enums.WriteOffTypes;
public record WriteOffResponse (
LocalDate writeOffDate,String customerId,String customer,WriteOffTypes writeOffReason,double amountTendered,String currencyId,String currency,double exchangeRate,double changeGiven,double amount,String amountWords,boolean bLPostStatus,boolean clPostStatus,boolean glPostStatus,double amountRecovered,String writeOffInvoicesId, String writeOffInvoices) implements ResponseData{

}
