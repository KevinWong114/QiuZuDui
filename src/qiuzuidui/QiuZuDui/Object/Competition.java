package qiuzuidui.QiuZuDui.Object;

/**
 * Created by getkong on 2015/9/19.
 */
public class Competition {
    /** 活动名称 */
    private String name;
    /** 活动简述 */
    private String description;
    /** 活动照片资源ID */
    private int imageId;
    /** 活动主办方*/
    private String sponsor;
    /** 活动承办方*/
    private String contractor;
    /** 活动协办方*/
    private String coOrganizer;

    public Competition(String mName, String mDescription, int mImageId) {
        this.name = mName;
        this.description = mDescription;
        this.imageId = mImageId;
    }

    public Competition(){}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    public void setName(String mName) {
        this.name = mName;
    }

    public void setDescription(String mDescription) {
        this.description = mDescription;
    }

    public void setImageId(int mImageId) {
        this.imageId = mImageId;
    }

    public void setSponsor(String mSponsor) {
        this.sponsor = mSponsor;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setContractor(String mContractor) {
        this.contractor = mContractor;
    }

    public String getContractor() {
        return contractor;
    }

    public void setCoOrganizer(String mCoOrganizer) {
        this.coOrganizer = mCoOrganizer;
    }

    public String getCoOrganizer() {
        return this.coOrganizer;
    }

}
