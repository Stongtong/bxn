package com.wxwx.bxnweb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wxt
 * @since 2019-10-13
 */
@TableName("forum_post")
public class Post extends Model<Post> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    private String name;

    private String category;

    private String label;

    private String content;

    private String picpath;

    private String watchnum;

    private String commentnum;

    private LocalDateTime createtime;

    private LocalDateTime updatetime;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }
    public String getWatchnum() {
        return watchnum;
    }

    public void setWatchnum(String watchnum) {
        this.watchnum = watchnum;
    }
    public String getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(String commentnum) {
        this.commentnum = commentnum;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }
    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.pid;
    }

    @Override
    public String toString() {
        return "Post{" +
            "pid=" + pid +
            ", name=" + name +
            ", category=" + category +
            ", label=" + label +
            ", content=" + content +
            ", picpath=" + picpath +
            ", watchnum=" + watchnum +
            ", commentnum=" + commentnum +
            ", createtime=" + createtime +
            ", updatetime=" + updatetime +
        "}";
    }
}
