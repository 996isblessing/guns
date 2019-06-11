package com.stylefeng.guns.rest.modular.film;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.ConditionResult;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.FilmConditionVoW;
import com.stylefeng.guns.rest.common.persistence.model.index.IndexPageInfoW;
import com.stylefeng.guns.rest.common.persistence.model.index.IndexResultW;
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
    public IndexPageInfoW getIndex() {

        IndexResultW indexResultW = filmService.queryIndexMsg();

        IndexPageInfoW indexPageInfoW = new IndexPageInfoW();
        indexPageInfoW.setData(indexResultW);
        indexPageInfoW.setStatus(0);
        indexPageInfoW.setImgPre("http://img.meetingshop.cn/");
        return indexPageInfoW;
    }

    @RequestMapping("/getconditionlist")
    @ResponseBody
    public ConditionResult getConditionList() {
        ConditionResult result = new ConditionResult();
        FilmConditionVoW filmCondition = filmService.getFilmCondition();
        result.setStatus(0);
        result.setData(filmCondition);
        return result;
    }

    @RequestMapping("/filmtest")
    @ResponseBody
    public String test() {
        String s = filmService.myTest();
        return s;
    }

}
