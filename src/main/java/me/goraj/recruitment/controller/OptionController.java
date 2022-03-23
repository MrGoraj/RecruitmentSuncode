package me.goraj.recruitment.controller;

import me.goraj.recruitment.model.Option;
import me.goraj.recruitment.repository.OptionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/option")
public class OptionController {

    private final OptionRepository repository;

    public OptionController(OptionRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin("http://localhost:8080")
    @GetMapping(value = "/result")
    public List<Option> getResult(@RequestParam(value = "option-choice") String option) {
        if (option.equals("Distinct")) {
            return repository.findDistinctByColumnDistinct();
        } else if (option.equals("NotDistinct")) {
            return repository.findDistinctByColumnNotDistinct();
        }
        return null;
    }
}