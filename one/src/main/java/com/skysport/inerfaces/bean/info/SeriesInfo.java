package com.skysport.inerfaces.bean.info;import com.skysport.core.bean.system.SelectItem;/** * 系列表 */public class SeriesInfo extends SelectItem {    private String id;    private String seriesId;    private String areaId;    private String areaName;    private String remark;    private int delFlag;    private String updateTime;    public String getId() {        return id;    }    public void setId(String id) {        this.id = id;    }    public String getSeriesId() {        return seriesId;    }    public void setSeriesId(String seriesId) {        this.seriesId = seriesId;    }    public String getAreaId() {        return areaId;    }    public void setAreaId(String areaId) {        this.areaId = areaId;    }    public String getAreaName() {        return areaName;    }    public void setAreaName(String areaName) {        this.areaName = areaName;    }    public String getRemark() {        return remark;    }    public void setRemark(String remark) {        this.remark = remark;    }    public int getDelFlag() {        return delFlag;    }    public void setDelFlag(int delFlag) {        this.delFlag = delFlag;    }    public String getUpdateTime() {        return updateTime;    }    public void setUpdateTime(String updateTime) {        this.updateTime = updateTime;    }}