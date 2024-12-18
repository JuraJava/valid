package com.hstn.valid;

import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    @InitBinder
    // Когда Spring видит эту аннотацию он во введённых
    // пользователем данных на форме убирает лишние пробелы
    public void initBinder(WebDataBinder binder) {
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, ste);
    }

    @GetMapping("/client")
    public String showClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "client-form";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("client") Client client, BindingResult bindingResult) {
        System.out.println(bindingResult);
//  При переходе в браузере со страницы /client на страницу /processForm
//  происходит валидация введённых пользователем данных. Каких?
//  Которые указаны в параметрах аннотации @ModelAttribute, т.е. данные введённые
//  сверяются с данными какими они должны быть  (указанные в классе Client)
//  Эти введённые данные записываются в переменную bindingResult и далее проверяются
        if (bindingResult.hasErrors()) {
            return "client-form";
        }
        else {
            return "client-confirmation";
            // client-confirmation – HTML-файл с таким названием необходимо создать далее
        }
    }
}