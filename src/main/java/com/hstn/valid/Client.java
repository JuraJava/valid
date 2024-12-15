package com.hstn.valid;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Client {
    private String firstName;


    @NotNull(message = "Enter last name.")
    // Эта аннотация предупреждает пользователя, что поле не может быть пустым
    @Size(min=2, max=100, message = "Enter correct lastName.")
    // Эта аннотация предупреждает пользователя, какой минимальной и какой
    // максимальной длины в символах должнно быть значение поля, а также
    // выводит сообщение если введено неправильно
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
