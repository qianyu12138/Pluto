package cn.pluto.po;

import java.util.List;

public class IndexCustom extends Index {
    private List<IndexCarousel> indexCarouselList;//轮播图
    private List<IndexCarousel> indexImgItems;//中间图片
    private List<Photograph> photographs;
    private List<KindCustom> kindCustoms;
    private List<ReviewCustom> reviewCustoms;

    public List<ReviewCustom> getReviewCustoms() {
        return reviewCustoms;
    }

    public void setReviewCustoms(List<ReviewCustom> reviewCustoms) {
        this.reviewCustoms = reviewCustoms;
    }

    public List<KindCustom> getKindCustoms() {
        return kindCustoms;
    }

    public void setKindCustoms(List<KindCustom> kindCustoms) {
        this.kindCustoms = kindCustoms;
    }

    public List<Photograph> getPhotographs() {
        return photographs;
    }

    public void setPhotographs(List<Photograph> photographs) {
        this.photographs = photographs;
    }

    public List<IndexCarousel> getIndexImgItems() {
        return indexImgItems;
    }

    public void setIndexImgItems(List<IndexCarousel> indexImgItems) {
        this.indexImgItems = indexImgItems;
    }

    public List<IndexCarousel> getIndexCarouselList() {
        return indexCarouselList;
    }

    public void setIndexCarouselList(List<IndexCarousel> indexCarouselList) {
        this.indexCarouselList = indexCarouselList;
    }
}
