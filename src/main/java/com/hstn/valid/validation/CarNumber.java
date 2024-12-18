package com.hstn.valid.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy = CarNumberValidator.class)
// Constraint (Ограничение). Эта аннотация в своих параметрах указывает
// для какого класса будут прописаны правила валидации
//@Target(ElementType.FIELD)
// Эта аннотация показывает к чему будет применяться аннотация  @interface
// в данном случае к полям FIELD
// Также можно и к, например, методам и др.
// В том случае когда к нескольким необходимо
// перечислить их через запятую и взять в фигурные скобки
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
// Будет выполняться во время выполнения
// программы RUNTIME (Время выполнения) Retention (Удержание)
public @interface CarNumber {
    public String value() default "USA";
    public String message() default "Car number must ends USA!";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
