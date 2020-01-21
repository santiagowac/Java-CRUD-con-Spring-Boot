package com.example.crud.controller;

import com.example.crud.bl.PersonaService;
import com.example.crud.model.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("List", personaService.getAll());
        return "index";

    }

    @GetMapping("/save/{id}")
    public String showSave(@PathVariable("id") Integer id, Model model){
        if(id != null && id != 0){
            model.addAttribute("persona", personaService.get(id));
        }else{
            model.addAttribute("persona", new Persona());
        }

        return "save";
    }

    @PostMapping("/save")
    public String save(Persona persona, Model model){
        personaService.save(persona);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, Model model){
        personaService.delete(id);
        return "redirect:/";
    }

    
}