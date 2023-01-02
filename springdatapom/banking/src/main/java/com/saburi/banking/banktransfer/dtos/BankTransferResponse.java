package com.saburi.banking.banktransfer.dtos;
import com.saburi.root.dtos.ResponseData;
import com.saburi.root.enums.BankAccountTypes;
public record BankTransferResponse (
BankAccountTypes fromAccountType,String fromAccountNoId, String fromAccountNo,String fromAccountName,String fromCurrencyId,String fromCurrency,BankAccountTypes toAccountType,String toAccountNoId, String toAccountNo,String toAccountName,String toCurrencyId,String toCurrency,double exchangeRate,double amountTendered,double amount) implements ResponseData{

}
