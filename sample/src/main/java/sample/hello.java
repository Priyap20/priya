package sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class hello {
	@RequestMapping("/home")
public String sayhi() {
	return"i am a home componant";
}
}
