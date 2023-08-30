package com.cocoa.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginDTO {
    private String lEMAIL;
    private String lPASSWORD;

    public String getlEMAIL() {
        return lEMAIL;
    }

    public String getlPASSWORD() {
        return lPASSWORD;
    }
}
