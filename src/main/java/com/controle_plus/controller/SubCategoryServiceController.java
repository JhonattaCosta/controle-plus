package com.controle_plus.controller;

import com.controle_plus.mappers_dto.SubCategoryDTO;
import com.controle_plus.services.SubCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subcategory")
public class SubCategoryServiceController {
    private final SubCategoryService subCategoryService;

    public SubCategoryServiceController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }

    //Create
    @PostMapping("/create")
    public SubCategoryDTO createSubCategory (@RequestBody SubCategoryDTO subCategoryDTO){
        return subCategoryService.createSubCategory(subCategoryDTO);
    }

    //Find All
    @GetMapping("/list")
    public List<SubCategoryDTO> listSubCategory (){
        return subCategoryService.listSubCategory();
    }

    //Find by ID
    @GetMapping("list/{id}")
    public SubCategoryDTO listSubCategoryById(@PathVariable Long id) {
        return subCategoryService.listSubCategoryById(id);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public void deleteSubCategoryId (@PathVariable Long id){
        subCategoryService.deleteSubCategoryById(id);
    }


}
