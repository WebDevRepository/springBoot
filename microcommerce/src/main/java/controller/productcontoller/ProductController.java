package controller.productcontoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.product.Product;

@RestController
public class ProductController {

    //Récupérer la liste des produits
    @RequestMapping(value="/Produits", method=RequestMethod.GET)
    public String listeProduits() {
        return"Un exemple de produit";}
    

    //Récupérer un produit par son Id
//    @GetMapping(value="/Produits/{id}")
//    public Product afficherUnProduit(@PathVariableintid) {
 //       Product product=new Product(id, new String("Aspirateur"), 100 );
  //      return product;
    }
