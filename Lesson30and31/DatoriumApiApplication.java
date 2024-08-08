package com.datorium.Datorium.API;

import com.datorium.Datorium.API.DTOs.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

	@GetMapping("/ping") // the "ping" (in this case) is called "the endpoint"
	public String ping() {
		return "pong";
	}

	@GetMapping("/hello") // call this function from browser by writing port8080/hello?name=Laila (everything after the "?" is called parameter/param
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/sum")
	public int sum(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2) {
		return number1 + number2;
	}

	@GetMapping("/multiply")
	public int multiply(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2) {
		return number1 * number2;
	}

	@GetMapping("/birthdays") //Function without parameters
	public String[] birthdays() {
		String[] birthdays = new String[4];
		birthdays[0] = "20.02";
		birthdays[1] = "13.08";
		birthdays[2] = "04.06";
		birthdays[3] = "20.04";
		return birthdays;
	}

	@GetMapping("/summer") //Function with parameters
	public String summer(@RequestParam(value = "temperature") float temperature) {
		Summer summer = new Summer(temperature);
		if (temperature >= 20) {
			summer.setActivity("Sunbathing");
			summer.setBeachWeather(true);
		} else {
			summer.setActivity("Read a book");
			summer.setBeachWeather(false);
		}
		return String.format("The temperature is %.2f! " +
				"\nAn activity we recommend: %s! " +
				"\nIs it beach weather? %b!", temperature, summer.activity, summer.isHotEnoughForBeach);
	}

	@GetMapping("/getbook")
	public Book book() {
		Book book = new Book();
		book.title = "Book Title";
		book.author = "Author";
		return book;
	}

	@PostMapping("/postexample") // post method
	public Book addBook(@RequestBody Book book) { // receives data from the body of the request
		book.title = book.title.toUpperCase();
		return book;
	}

	// user to authorize using useranme and password, then provide profile (name, surname, age, email)
	@PostMapping("/authorize")
	public User authorize(@RequestBody Credentials credentials) {
		// username + password
		if (credentials.username.equalsIgnoreCase("laila") && credentials.password.equalsIgnoreCase("12345")) {
			User user = new User();
			user.name = "Laila";
			return user;
		}
		return null;
	}

	@PostMapping("/return")
	public ResultItem sendItem(@RequestBody Item item) {
		ResultItem resultItem = new ResultItem();
		String starSign = ResultItem.findStarSign(item.getBirthDate()); // Get the star sign
		resultItem.setResult(starSign); // Set the result in the ResultItem object
		return resultItem; // Return the ResultItem object
	}
}
