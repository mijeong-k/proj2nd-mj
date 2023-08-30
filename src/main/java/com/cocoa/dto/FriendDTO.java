package com.cocoa.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FriendDTO {
    private String fName;
    private String fEmail;
    private String fPassword;
    private String fPhone;
    private String fJob;
    private String fRecently;
    private String fMycourse;

//    public static FriendDTO toFriendDTO(FriendEntity friendEntity) {
//        FriendDTO friendDTO = new FriendDTO();
//        friendDTO.setId(friendEntity.getId());
//        friendDTO.setF_pwd(friendEntity.getF_pwd());
//        friendDTO.setF_name(friendEntity.getF_name());
//        friendDTO.setF_number(friendEntity.getF_number());
//        friendDTO.setF_job(friendEntity.getF_job());
//        return friendDTO;
//    }
}

