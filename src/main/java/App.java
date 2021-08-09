import java.util.HashMap;

import spark.ModelAndView;
import java.util.Map;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> { //request for route happens at this location
            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
            return new ModelAndView(model, "home.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine()); //

        get("/addSquad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "addSqaud.hbs");
        }, new HandlebarsTemplateEngine());

    }
}