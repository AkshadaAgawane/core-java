import java.util.*;
import java.security.*;
interface Food {
	 public String getType();
	}
	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {

	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	class FoodFactory {
		public Food getFood(String order) {
			if (order.equalsIgnoreCase("cake")) {
				Food c = new Cake();
				return c;
			}
			else {
				Food p = new Pizza();
				return p;
			}

		}

	}

	