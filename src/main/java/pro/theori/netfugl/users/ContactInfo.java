package pro.theori.netfugl.users;

import lombok.Data;

@Data
public class ContactInfo {
    private String postalAddress;
    private String postalCode;
    private String postalDistrict;
    private String address2;
    private String country;
    private String mobilephone;
    private String email;
}
