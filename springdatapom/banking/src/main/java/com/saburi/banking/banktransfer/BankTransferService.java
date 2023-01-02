/*
 Sam Buriima
generated by Saburi Tools
*/
package com.saburi.banking.banktransfer;

import com.saburi.root.repositories.PagingAndSortingRepo;
import com.saburi.banking.banktransfer.dtos.BankTransferRequest;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;
import com.saburi.root.services.BaseService;
import com.saburi.root.dtos.ResponseData;
import com.saburi.root.utils.KnownException;
import java.util.List;

@Service
public class BankTransferService  extends BaseService<BankTransfer,BankTransferRequest, Integer>{




    private static final String ENTITY_CAPTION = "Bank Transfer";
    @Autowired
    private BankTransferRepo bankTransferRepo;
@Override
public String getEntityCaption(){
 return ENTITY_CAPTION;
}
@Override
public PagingAndSortingRepo<BankTransfer, Integer> getRepository(){
 return bankTransferRepo;
}
@Override
public List<? extends ResponseData> getMiniData(){
 return bankTransferRepo.findAllBy();
}
@Override
public boolean isValid(BankTransfer bankTransfer)throws Exception{
 return super.isValid(bankTransfer);
}
@Override
public BankTransfer instantiate(){
 return new BankTransfer();
}
@Override
    public BankTransfer setEntity(BankTransfer e, BankTransferRequest req) throws Exception{
e.setFromAccountType(req. getFromAccountType());
e.setFromAccountNo(req. getFromAccountNo());
e.setFromCurrencyId(req. getFromCurrencyId());
e.setToAccountType(req. getToAccountType());
e.setToAccountNo(req. getToAccountNo());
e.setToCurrencyId(req. getToCurrencyId());
e.setExchangeRate(req. getExchangeRate());
e.setAmountTendered(req. getAmountTendered());
e.setAmount(req. getAmount());
return e;

}


}
