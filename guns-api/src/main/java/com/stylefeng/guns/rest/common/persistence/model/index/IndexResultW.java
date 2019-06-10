package com.stylefeng.guns.rest.common.persistence.model.index;



import java.io.Serializable;
import java.util.List;


/**
 * 对应data
 */
public class IndexResultW implements Serializable {
    List<BannerW> bannerWS;
    FilmTemplateW hotFilms;
    FilmTemplateW soonFilms;
    List<FilmInfoW> boxRanking;
    List<FilmInfoW> expectRanking;
    List<FilmInfoW> top100;

    public List<BannerW> getBannerWS() {
        return bannerWS;
    }

    public void setBannerWS(List<BannerW> bannerWS) {
        this.bannerWS = bannerWS;
    }

    public FilmTemplateW getHotFilms() {
        return hotFilms;
    }

    public void setHotFilms(FilmTemplateW hotFilms) {
        this.hotFilms = hotFilms;
    }

    public FilmTemplateW getSoonFilms() {
        return soonFilms;
    }

    public void setSoonFilms(FilmTemplateW soonFilms) {
        this.soonFilms = soonFilms;
    }

    public List<FilmInfoW> getBoxRanking() {
        return boxRanking;
    }

    public void setBoxRanking(List<FilmInfoW> boxRanking) {
        this.boxRanking = boxRanking;
    }

    public List<FilmInfoW> getExpectRanking() {
        return expectRanking;
    }

    public void setExpectRanking(List<FilmInfoW> expectRanking) {
        this.expectRanking = expectRanking;
    }

    public List<FilmInfoW> getTop100() {
        return top100;
    }

    public void setTop100(List<FilmInfoW> top100) {
        this.top100 = top100;
    }

    @Override
    public String toString() {
        return "IndexResultW{" +
                "bannerWS=" + bannerWS +
                ", hotFilms=" + hotFilms +
                ", soonFilms=" + soonFilms +
                ", boxRanking=" + boxRanking +
                ", expectRanking=" + expectRanking +
                ", top100=" + top100 +
                '}';
    }
}
