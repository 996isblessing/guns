package com.stylefeng.guns.rest.modular.cinema;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.modular.cinema.model.*;
import com.stylefeng.guns.rest.modular.cinema.myinterface.CinemaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaController {
    @Reference(check = false)
    CinemaService cinemaService;

    @PostMapping("/cinema/getFieldInfo")
    public Result getFieldInfo(int cinemaId, int fieldId) {
        try {
            CinemaResult result = cinemaService.getFieldInfo(cinemaId, fieldId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return new ExceptionResult(999, "系统出现异常，请联系管理员");
        }
    }

    @GetMapping("/cinema/getCinemas")
    @ResponseBody
    public Result getCinemas(CinemaQueryVO cinemaQueryVO) {
        try {
            Result cinemasResult = cinemaService.getCinemas(cinemaQueryVO);
            return cinemasResult;
        } catch (Exception e) {
            e.printStackTrace();
            return new ExceptionResult(999, "系统出现异常，请联系管理员");
        }
    }

    @GetMapping("/cinema/getCondition")
    @ResponseBody
    public Result getCondition(Integer brandId, Integer hallType, Integer areaId) {
        try {
            Result cinemasResult = cinemaService.getCondition(brandId, hallType, areaId);
            return cinemasResult;
        } catch (Exception e) {
            e.printStackTrace();
            return new ExceptionResult(999, "系统出现异常，请联系管理员");
        }
    }
}
