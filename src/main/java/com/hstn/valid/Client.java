package com.hstn.valid;

import jakarta.validation.constraints.*;

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

    @NotNull
    @Pattern(regexp = "^[0-9]{5}", message = "Enter valid zipCode. Only numbers, 5 digit.")
    // В случаях когда требуется чтобы данные вводились
    // по какому-то шаблону используется эта аннотация
    // В параметрах этой аннотации указывается регулярные
    // выражения и сообщение, которое показывается пользователю
    // в случае если он ввёл неверно
    // "^[0-9]{5}" - означает, что строка должна начинаться с
    // цифры от 0 до 9 и таких цифр должно быть 5.
    // А чтобы пользователь не оставлял поле пустым, кроме того
    // это поле необходимо пометить аннотацией @NotNull

    private String zipCode;

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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
