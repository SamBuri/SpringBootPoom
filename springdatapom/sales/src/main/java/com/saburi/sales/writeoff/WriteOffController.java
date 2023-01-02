/*
 Sam Buriima
generated by Saburi Tools
*/
package com.saburi.sales.writeoff;

import com.saburi.sales.writeoff.dtos.WriteOffRequest;
import com.saburi.root.controllers.BaseController;
import com.saburi.root.services.BaseServiceIDGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("writeoffs")
public class WriteOffController  extends BaseController<WriteOff, WriteOffRequest, String>{




@Autowired
    private WriteOffService writeOffService;@Override
    protected BaseServiceIDGen<WriteOff, WriteOffRequest, String> getBaseService() {
        return writeOffService;
    }

}
