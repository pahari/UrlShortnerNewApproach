package com.proxy.demo.Controller;

import com.proxy.demo.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UrlController {

    @Autowired
    UrlService urlservice;

    public void setUrlservice(UrlService urlservice) {
        this.urlservice = urlservice;
    }

    @GetMapping("/get")
    public @ResponseBody String getsurl(@RequestParam(value = "lurl") String lurl){
     if(lurl == null)
         return "Please enter the url";
     else
        return urlservice.getsurl(lurl);

    }

    @RequestMapping(value="/{path:[0-9,A-Z,a-z]+}")
    public RedirectView handleTestRequest (@PathVariable String path) {
        RedirectView rv = new RedirectView();
        String s = urlservice.getlurl(path);
        if(s == null)
            rv.setUrl("http://localhost:8080/404.html");
        else
            rv.setUrl("http://"+s);
        return rv;
    }
}





