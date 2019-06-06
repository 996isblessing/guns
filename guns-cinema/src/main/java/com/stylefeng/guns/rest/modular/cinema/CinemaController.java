package com.stylefeng.guns.rest.modular.cinema;


import com.stylefeng.guns.rest.common.persistence.model.ResponseVo;
import com.stylefeng.guns.rest.common.persistence.model.inputparam.CinemaQueryVO;
import com.stylefeng.guns.rest.common.persistence.model.result.Result;
import com.stylefeng.guns.rest.modular.cinema.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CinemaController {
    @Autowired(required = false)
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
    public ResponseVo getFields(int cinemaId){
       ResponseVo responseVo = cinemaService.getFields(cinemaId);

       return responseVo;

    }


}
