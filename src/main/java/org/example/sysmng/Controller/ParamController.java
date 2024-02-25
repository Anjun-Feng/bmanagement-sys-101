package org.example.sysmng.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {
    @RequestMapping(value = "/postTest", method = RequestMethod.POST)
        public String postTest(String username) {
            return "POST username: " + username;
        }

}
