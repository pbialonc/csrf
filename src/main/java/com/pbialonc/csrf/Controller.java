package com.pbialonc.csrf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/teapot", method = RequestMethod.POST)
    @ResponseBody
    public void teapot() {
    }

    @RequestMapping(value = "/other", method = RequestMethod.POST)
    @ResponseBody
    public void other() {
    }

}
