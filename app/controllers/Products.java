package controllers;

import com.avaje.ebean.Model;
import com.mycompany.Product;
import com.mycompany.Service;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import play.twirl.api.Content;
import views.html.index2;

import static play.libs.Json.toJson;


public class Products extends Controller {
    public Result index(int n) {
        List<Product> productsy = Service.getProducts(n);
        //return ok(views.html.products.render(productsy));
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
