package com.stylefeng.guns.rest.modular.ciname;


import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.cinema.CinemaService;
import com.stylefeng.guns.rest.common.persistence.model.ResponseVo;
import com.stylefeng.guns.rest.common.persistence.model.inputparam.CinemaQueryVO;
import com.stylefeng.guns.rest.common.persistence.model.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CinemaController {
    @Reference(check = false)
    CinemaService cinemaService;

    @GetMapping("/cinema/getCinemas")
    @ResponseBody
    public Result getCinemas(CinemaQueryVO cinemaQueryVO) {
        Result cinemasResult = cinemaService.getCinemas(cinemaQueryVO);
        return cinemasResult;
    }


    @GetMapping("/cinema/getCondition")
    @ResponseBody
    public Result getCondition(Integer brandId,Integer hallType,Integer areaId) {
        Result cinemasResult = cinemaService.getCondition(brandId,hallType,areaId);
        return cinemasResult;
    }

    @GetMapping("/cinema/getFields")
    @ResponseBody
    public Result getFields(int cinemaId){
       Result responseVo = cinemaService.getFields(cinemaId);
       return responseVo;
    }

    @RequestMapping(value = "/cinema/getFieldInfo" ,method = RequestMethod.POST)
    @ResponseBody
    public Result getFieldInfo(Integer cinemaId,Integer fieldId){
        Result responseVo = cinemaService.getFieldInfo(cinemaId,fieldId);
        return responseVo;
    }


}
