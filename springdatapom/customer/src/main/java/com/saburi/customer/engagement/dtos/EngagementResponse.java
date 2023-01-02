package com.saburi.customer.engagement.dtos;
import com.saburi.root.dtos.ResponseData;
import com.saburi.customer.enums.EngagementReasons;
import com.saburi.customer.enums.EngagementModes;
import com.saburi.root.enums.;
public record EngagementResponse (
String customerId, String customer,LocalDate engagementDate,EngagementReasons engagementReason,EngagementModes engagementMode,String description,String attendingPersonnel,String status, nextEngagementDate,String expectedNextEngagementModeId, String expectedNextEngagementMode,String parentEngagementId, String parentEngagement) implements ResponseData{

}
