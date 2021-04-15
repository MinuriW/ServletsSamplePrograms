package com.hcl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TraineeController {

@RequestMapping("/hello")
public String sendRequest()
	{
		return "welcome";
	}
@RequestMapping("/bye")
public String sendResponse() {
	return "bye";
}
}
