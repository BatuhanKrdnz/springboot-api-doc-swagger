package com.example.springbootapidocswagger;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    private List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init(){
        petList.add(new Pet(1, "Test Pet", new Date()));
    }

    @PostMapping()
    @ApiOperation(value = "Method for adding a new Pet", notes = "Use with care")
    public ResponseEntity<Pet> save(@RequestBody @ApiParam(value = "Animal") Pet pet){
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping()
    @ApiOperation(value = "Methor for listing Pets", notes = "This methods lists all Pets")
    public ResponseEntity<List<Pet>> listAll(){
        return ResponseEntity.ok(petList);
    }


}
