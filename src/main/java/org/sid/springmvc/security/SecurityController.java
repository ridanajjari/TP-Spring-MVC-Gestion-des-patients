package org.sid.springmvc.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	@GetMapping("/NOtAUTORIZED")
	public String error() {
		
		return "NOtAUTORIZED";
	}

}
