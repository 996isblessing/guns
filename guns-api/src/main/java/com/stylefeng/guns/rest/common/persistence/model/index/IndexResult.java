package com.stylefeng.guns.rest.common.persistence.model.index;



import java.io.Serializable;
import java.util.List;


/**
 * 对应data
 */
public class IndexResult implements Serializable {
    List<Banner> banners;
    FilmTemplate hotFilms;
    FilmTemplate soonFilms;
    List<FilmInfo> boxRanking;
    List<FilmInfo> expectRanking;
    List<FilmInfo> top100;

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public FilmTemplate getHotFilms() {
        return hotFilms;
    }

    public void setHotFilms(FilmTemplate hotFilms) {
        this.hotFilms = hotFilms;
    }

    public FilmTemplate getSoonFilms() {
        return soonFilms;
    }

    public void setSoonFilms(FilmTemplate soonFilms) {
        this.soonFilms = soonFilms;
    }

    public List<FilmInfo> getBoxRanking() {
        return boxRanking;
    }

    public void setBoxRanking(List<FilmInfo> boxRanking) {
        this.boxRanking = boxRanking;
    }

    public List<FilmInfo> getExpectRanking() {
        return expectRanking;
    }

    public void setExpectRanking(List<FilmInfo> expectRanking) {
        this.expectRanking = expectRanking;
    }

    public List<FilmInfo> getTop100() {
        return top100;
    }

    public void setTop100(List<FilmInfo> top100) {
        this.top100 = top100;
    }

    @Override
    public String toString() {
        return "IndexResult{" +
                "banners=" + banners +
                ", hotFilms=" + hotFilms +
                ", soonFilms=" + soonFilms +
                ", boxRanking=" + boxRanking +
                ", expectRanking=" + expectRanking +
                ", top100=" + top100 +
                '}';
    }
}
