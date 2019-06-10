package com.stylefeng.guns.rest.modular.film;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.FilmConditionVo;
import com.stylefeng.guns.rest.common.persistence.model.index.IndexPageInfo;
import com.stylefeng.guns.rest.common.persistence.model.index.IndexResult;
import com.stylefeng.guns.rest.film.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/film")
public class FilmControllerW {

    @Reference
    FilmService filmService;

    @RequestMapping("/getindex")
    @ResponseBody
    public IndexPageInfo getIndex() {
        System.out.println("1");
        System.out.println("2");
        IndexResult indexResult = filmService.queryIndexMsg();
        System.out.println(indexResult);
        IndexPageInfo indexPageInfo = new IndexPageInfo();
        indexPageInfo.setData(indexResult);
        indexPageInfo.setStatus(0);
        indexPageInfo.setImgPre("http://img.meetingshop.cn/");
        return indexPageInfo;
    }

    @RequestMapping("/getConditionList")
    @ResponseBody
    public FilmConditionVo getConditionList() {
        FilmConditionVo filmCondition = filmService.getFilmCondition();
        return filmCondition;
    }

    @RequestMapping("/filmtest")
    @ResponseBody
    public String test() {
        String s = filmService.myTest();
        return s;
    }

}
