package controllers;

import play.mvc.Controller;
import play.mvc.Router;

public class Facebook extends Controller {
	
	public static final String APP_ID = "259176644136057";
	public static final String APP_SECRET = "a465e617d556c8ee0a34359129e259cf";

	public static void index() {
		render();
	}
	
	public static void canvas() {
		redirect("https://www.facebook.com/dialog/oauth?client_id="+APP_ID+"&redirect_uri=https://hollow-stream-9914.herokuapp.com/Facebook/index");
	}

	
	public static void tabread() {
		render();
	}

	public static void tabedit() {
		render();
	}

	public static void channel() {
		render();
	}

}
