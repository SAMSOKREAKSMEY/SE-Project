package se.project.pc_setup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("pc_setup")

public class ProductController {
    @GetMapping("/product")
    public String Products(Model model) {
        List<Product> products = new ArrayList<>();
       
        model.addAttribute("products", products);
        return "product";
     }
     @GetMapping("/insert_product")
     public String InsertProduct(Model model) {
         List<Product> products = new ArrayList<>();
         model.addAttribute("products", products);
         return "InsertProduct";
     }
 
     @GetMapping("/update_product")
     public String UpdateProduct(Model model) {
         return "UpdateProduct";
     }
    
}



