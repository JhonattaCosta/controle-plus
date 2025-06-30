package com.controle_plus.controller;

import com.controle_plus.mappers_dto.SubCategoryDTO;
import com.controle_plus.services.SubCategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/subcategory")
public class SubCategoryController {
    private final SubCategoryService subCategoryService;

    public SubCategoryController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }

    //Create
    @PostMapping("/create")
    public ResponseEntity<String> createSubCategory (@RequestBody SubCategoryDTO subCategoryDTO){
        SubCategoryDTO newSubCategory = subCategoryService.createSubCategory(subCategoryDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Sub-Category created Successfully!");
    }

    //Find All
    @GetMapping("/list")
    public ResponseEntity<List<SubCategoryDTO>> listSubCategory (){
        List<SubCategoryDTO> subCategorys = subCategoryService.listSubCategory();
        return ResponseEntity.ok(subCategorys);
    }

    //Find by ID
    @GetMapping("list/{id}")
    public ResponseEntity<?> listSubCategoryById(@PathVariable Long id) {
        SubCategoryDTO subCategory = subCategoryService.listSubCategoryById(id);
        if (subCategory != null){
            return ResponseEntity.ok(subCategory);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Sub-Category with id: " +id+ " not found!");
        }
    }

    //Change
    @PatchMapping("/change/{id}")
    public ResponseEntity<?> changeSubCategory(@RequestBody SubCategoryDTO subCategoryDTO, @PathVariable Long id){
        SubCategoryDTO subCategory = subCategoryService.listSubCategoryById(id);
        if (subCategory != null){
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(subCategoryService.changeSubCategory(subCategoryDTO,id));
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Sub-Caegory with id: " + id + " not found");
        }
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSubCategoryId (@PathVariable Long id){
        SubCategoryDTO subCategory = subCategoryService.listSubCategoryById(id);
        if (subCategory != null){
            subCategoryService.deleteSubCategoryById(id);
            return ResponseEntity.ok("Sub-Category with id: "+ id + " was deleted Successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Sub-Category with id: " +id+ " not found!");
        }

    }


}
