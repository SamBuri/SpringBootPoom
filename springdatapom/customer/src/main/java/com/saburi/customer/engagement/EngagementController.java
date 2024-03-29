/*
 Sam Buriima
generated by Saburi Tools
*/
package com.saburi.customer.engagement;

import com.saburi.customer.engagement.dtos.EngagementRequest;
import com.saburi.root.controllers.BaseController;
import com.saburi.root.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("engagements")
public class EngagementController  extends BaseController<Engagement, EngagementRequest, Long>{




@Autowired
    private EngagementService engagementService;@Override
    protected BaseService<Engagement, EngagementRequest, Long> getBaseService() {
        return engagementService;
    }

}
