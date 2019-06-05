package com.stylefeng.guns.rest.common.persistence.model.index;



import java.util.List;


/**
 * 对应data
 */
public class IndexResult {
    List<Banner> banners;
    List<FilmTemplate> hotFilms;
    List<FilmTemplate> soonFilms;
    List<FilmTemplate> boxRanking;
    List<FilmTemplate> expectRanking;
    List<FilmTemplate> top100;

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public List<FilmTemplate> getHotFilms() {
        return hotFilms;
    }

    public void setHotFilms(List<FilmTemplate> hotFilms) {
        this.hotFilms = hotFilms;
    }

    public List<FilmTemplate> getSoonFilms() {
        return soonFilms;
    }

    public void setSoonFilms(List<FilmTemplate> soonFilms) {
        this.soonFilms = soonFilms;
    }

    public List<FilmTemplate> getBoxRanking() {
        return boxRanking;
    }

    public void setBoxRanking(List<FilmTemplate> boxRanking) {
        this.boxRanking = boxRanking;
    }

    public List<FilmTemplate> getExpectRanking() {
        return expectRanking;
    }

    public void setExpectRanking(List<FilmTemplate> expectRanking) {
        this.expectRanking = expectRanking;
    }

    public List<FilmTemplate> getTop100() {
        return top100;
    }

    public void setTop100(List<FilmTemplate> top100) {
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
