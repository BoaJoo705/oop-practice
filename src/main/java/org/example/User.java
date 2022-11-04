package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){  // password 초기화해주는 함수
//        RandomPasswordGenerator ramdomPasswordGeneator = new RandomPasswordGenerator(); // 낮은결합을 위해 인터페이스로
        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() >= 8 && password.length() <= 12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
