package com.stylefeng.guns.rest.modular.film;

import com.alibaba.dubbo.config.annotation.Reference;
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

    @Reference(check = false)
    FilmService filmService;

    @RequestMapping("/getIndex")
    @ResponseBody
    public IndexPageInfoW getIndex() {
        System.out.println("1");
        System.out.println("2");
        IndexResultW indexResultW = filmService.queryIndexMsg();
        System.out.println(indexResultW);
        IndexPageInfoW indexPageInfoW = new IndexPageInfoW();
        indexPageInfoW.setData(indexResultW);
        indexPageInfoW.setStatus(0);
        indexPageInfoW.setImgPre("http://img.meetingshop.cn/");
        return indexPageInfoW;
    }

    @RequestMapping("/getConditionList")
    @ResponseBody
    public FilmConditionVoW getConditionList() {
        FilmConditionVoW filmCondition = filmService.getFilmCondition();
        return filmCondition;
    }

    @RequestMapping("/filmtest")
    @ResponseBody
    public String test() {
        String s = filmService.myTest();
        return s;
    }

}
