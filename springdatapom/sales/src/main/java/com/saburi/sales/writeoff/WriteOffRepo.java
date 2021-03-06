/*
 Sam Buriima
generated by Saburi Tools
*/
package com.saburi.sales.writeoff;

import com.saburi.root.repositories.PagingAndSortingRepo;
import com.saburi.sales.writeoff.dtos.WriteOffMini;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;


public interface WriteOffRepo  extends PagingAndSortingRepo<WriteOff, String>{



 @Query("SELECT MAX(idHelper) from WriteOff w ")
public Optional<Integer> getMaxIdHelper();

public List<WriteOffMini> findAllBy();


}
