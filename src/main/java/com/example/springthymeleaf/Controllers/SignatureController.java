package com.example.springthymeleaf.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignatureController {

    @RequestMapping("formGreetingSign")
    public String formGreetingSign() {
        return "formGreetingSign.html";
    }

    @PostMapping("formSignatureReceival")
    public String formGreetingReceiver(@RequestParam String name,
                                       @RequestParam String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "formGreetingThankYou.html";
    }
}

/*
Uppgift 4d – Samla underskrifter
Du ska samla underskrifter för något som du tycker är viktigt. Att samla in underskrifter elektroniskt
skulle göra att du kan nå betydligt fler människor än annars.
• Skriv en HTML-sida med ett formulär där folk kan skriva ner sitt namn och mail.
• Skriv en controller-klass, med en metod som tar emot data postat från ditt formulär
• Spara ner alla underskrifter i en lista, på backend-sidan //TO-DO
• Skriv en sida som tackar den som skrivit på genom att skriva ut personen namn
• Typ: ”Tack John Doe”
• Se till att tack-sidan servas ut så fort någon skickar in formuläret
 */
