package sda.homework.myapphomework.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    private String login;
    private String pass;

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
}
