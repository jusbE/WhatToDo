package application.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class AppController {

    @RequestMapping("/")
    public ModelAndView getIndex(ModelAndView mv) {
        mv.setViewName("index");
        mv.getModel().put("template", "home");
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/tasklist")
    public ModelAndView tasklist(ModelAndView mv) {
        mv.setViewName("index");
        mv.getModel().put("template", "tasklist");
        return mv;
    }

    @RequestMapping("/timer")
    public ModelAndView timer(ModelAndView mv) {
        mv.setViewName("index");
        mv.getModel().put("template", "timer");
        return mv;
    }

    @RequestMapping("/statistics")
    public ModelAndView statistics(ModelAndView mv) {
        mv.setViewName("index");
        mv.getModel().put("template", "statistics");
        return mv;
    }

    @RequestMapping("/saveTask")
    public String createNewTask(
            @RequestParam(value = "taskName") String taskName,
            @RequestParam(value = "creationTime") Date creationTime,
            @RequestParam(value = "ownerId") String id

    ) {
        return "Success";
    }
}
