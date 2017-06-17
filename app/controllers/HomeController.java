package controllers;

/**
 * Created by Ashish Pushp Singh on 17/6/17 @AKkaActorsScheduler @AKkaActorsScheduler.
 */

import play.mvc.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

}
