package controllers;

import com.mycompany.Product;
import com.mycompany.Service;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index2;

import java.util.List;


public class Products extends Controller {

    public Result index(int n) {
        List<Product> productsy = Service.getProducts(n);
        return ok(index2.render(productsy));
    }

   /* public static void env() {
        renderText(play.Play.configuration.get("application.mode"));
    }*/

    public Result getProducts(int n) {
        List<Product> products = Service.getProducts(n);
        return ok(products.get(0).toString());
    }
}
