package com.lbs.paaskickstart.paas.kafka.conf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String userName;
    private String firstName;
    private String lastName;
    private Date birthDate;

}
