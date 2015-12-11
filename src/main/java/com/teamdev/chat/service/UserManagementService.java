package com.teamdev.chat.service;


import java.util.Date;

public interface UserManagementService {
    long register(RegisterUserDTO registerUserDTO);

    class RegisterUserDTO{
        final String login;
        final String password;
        final Long age;
        private Date birthday;

        public RegisterUserDTO(String login, String password, Long age, Date birthday) {
            this.login = login;
            this.password = password;
            this.age = age;
            this.birthday = birthday;
        }

        public Date getBirthday() {
            return birthday;
        }
    }
}
