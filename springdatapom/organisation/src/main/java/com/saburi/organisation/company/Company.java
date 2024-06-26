/*
 Sam Buriima
generated by Saburi Tools
*/
package com.saburi.organisation.company;

 import java.util.Objects;
 import jakarta.persistence.Column;
 import jakarta.persistence.Entity;
  import jakarta.persistence.Table;
 import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import com.saburi.root.entities.DBEntityGenID;
import com.saburi.root.dtos.ResponseData;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Size;
import com.saburi.organisation.enums.BusinessTypes;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import com.saburi.root.enums.DbTypes;


@Entity

@Table(name = "companies")
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class Company extends DBEntityGenID implements ResponseData{

@Lob
private byte[] logo;
@Size(max =  100, message =  "The field: Company Name size cannot be greater than 100")
@Column(length =  100, unique = true)
private String companyName;
@Enumerated(EnumType.STRING)
@Column(length = 100)private BusinessTypes businessType;
@Size(max =  100, message =  "The field: Address size cannot be greater than 100")
@Column(length =  100)
private String address;
@Size(max =  100, message =  "The field: Phone No size cannot be greater than 100")
@Column(length =  100)
private String phoneNo;
@Size(max =  100, message =  "The field: Email size cannot be greater than 100")
@Column(length =  100)
private String email;
@Size(max =  100, message =  "The field: Website size cannot be greater than 100")
@Column(length =  100)
private String website;
@Size(max =  100, message =  "The field: Tag Line size cannot be greater than 100")
@Column(length =  100)
private String tagLine;
@Size(max =  100, message =  "The field: Dev Name size cannot be greater than 100")
@Column(length =  100)
private String devName;
@Enumerated(EnumType.STRING)
@Column(length = 100)private DbTypes dbType;
@Size(max =  100, message =  "The field: Db Username size cannot be greater than 100")
@Column(length =  100)
private String dbUsername;
@Size(max =  100, message =  "The field: Db Password size cannot be greater than 100")
@Column(length =  100)
private String dbPassword;
@Column(name = "dbPort")private int dbPort;
@Size(max =  100, message =  "The field: Db Host size cannot be greater than 100")
@Column(length =  100)
private String dbHost;
@Size(max =  50, message =  "The field: Url size cannot be greater than 50")
@Column(length =  50)
private String url;

public Company(){
}
public  Company(byte[] logo,String companyName,BusinessTypes businessType,String address,String phoneNo,String email,String website,String tagLine,String devName,DbTypes dbType,String dbUsername,String dbPassword,int dbPort,String dbHost,String url){
 this.logo = logo;
this.companyName = companyName;
this.businessType = businessType;
this.address = address;
this.phoneNo = phoneNo;
this.email = email;
this.website = website;
this.tagLine = tagLine;
this.devName = devName;
this.dbType = dbType;
this.dbUsername = dbUsername;
this.dbPassword = dbPassword;
this.dbPort = dbPort;
this.dbHost = dbHost;
this.url = url;

}

public byte[] getLogo(){
 return logo;
}
public void setLogo(byte[] logo){
this.logo = logo;
}public String getCompanyName(){
 return companyName;
}
public void setCompanyName(String companyName){
this.companyName = companyName;
}public BusinessTypes getBusinessType(){
 return businessType;
}
public void setBusinessType(BusinessTypes businessType){
this.businessType = businessType;
}public String getAddress(){
 return address;
}
public void setAddress(String address){
this.address = address;
}public String getPhoneNo(){
 return phoneNo;
}
public void setPhoneNo(String phoneNo){
this.phoneNo = phoneNo;
}public String getEmail(){
 return email;
}
public void setEmail(String email){
this.email = email;
}public String getWebsite(){
 return website;
}
public void setWebsite(String website){
this.website = website;
}public String getTagLine(){
 return tagLine;
}
public void setTagLine(String tagLine){
this.tagLine = tagLine;
}public String getDevName(){
 return devName;
}
public void setDevName(String devName){
this.devName = devName;
}public DbTypes getDbType(){
 return dbType;
}
public void setDbType(DbTypes dbType){
this.dbType = dbType;
}public String getDbUsername(){
 return dbUsername;
}
public void setDbUsername(String dbUsername){
this.dbUsername = dbUsername;
}public String getDbPassword(){
 return dbPassword;
}
public void setDbPassword(String dbPassword){
this.dbPassword = dbPassword;
}public int getDbPort(){
 return dbPort;
}
public void setDbPort(int dbPort){
this.dbPort = dbPort;
}public String getDbHost(){
 return dbHost;
}
public void setDbHost(String dbHost){
this.dbHost = dbHost;
}public String getUrl(){
 return url;
}
public void setUrl(String url){
this.url = url;
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
        final Company company = (Company) o; if (this.getId() == null || company.getId() == null) {
            return false;
        }
return this.getId().equals(company.getId());

}
@Override
public int hashCode(){
  return Objects.hashCode(this.id);

}
 @Override
public String getDisplayKey(){
return this.companyName;
}


}
