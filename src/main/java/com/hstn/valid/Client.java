package com.hstn.valid;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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

    @Min(value = 18, message = "You must be older then 17.")
    @Max(value = 125, message = "You must be younger then 126.")
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
