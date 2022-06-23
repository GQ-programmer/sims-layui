package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.zgq.pojo.Log;
import pub.zgq.service.LogService;
import pub.zgq.utils.LayuiUtil;

import java.util.List;

/**
 * @Author 孑然
 */

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/findAll")
    public LayuiUtil findAll(){
        List<Log> list = logService.findAll();
        return LayuiUtil.data(list.size(), list);
    }
}
