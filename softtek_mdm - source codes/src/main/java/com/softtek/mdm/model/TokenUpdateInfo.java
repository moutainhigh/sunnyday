package com.softtek.mdm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 更新Token表
 * @author jane.hui
 *
 */
public class TokenUpdateInfo implements Serializable {
	
    /**
     * 主键
     * @mbggenerated
     */
    private Integer id;

    /**
     * PushMagic
     * @mbggenerated
     */
    private String pushMagic;

    /**
     * 唯一标识
     * @mbggenerated
     */
    private String token;

    /**
     * 主题
     * @mbggenerated
     */
    private String topic;

    /**
     * UDID
     * @mbggenerated
     */
    private String udid;
    
    /**
     * 用户外键
     */
    private Integer userId;

    /**
     * 删除描述文件的唯一标识符uuid
     */
    private String payloadIdentifier;
    
    /**
     * device Token
     */
    private String iosUuid;
    
    /**
     * 创建时间
     * @mbggenerated
     */
    private Date createDate;

    /**
     * 创建者
     * @mbggenerated
     */
    private Integer createUser;

    /**
     * 更新时间
     * @mbggenerated
     */
    private Date updateDate;

    /**
     * 更新者
     * @mbggenerated
     */
    private Integer updateUser;

    /**
     * 删除时间
     * @mbggenerated
     */
    private Date deleteTime;

    /**
     * unlockToken
     * @mbggenerated
     */
    private String unlockToken;
    
    private Integer isProfile;
    
    /**
     * uuid
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table token_update_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column token_update_info.id
     *
     * @return the value of token_update_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPushMagic() {
        return pushMagic;
    }

    public void setPushMagic(String pushMagic) {
        this.pushMagic = pushMagic == null ? null : pushMagic.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid == null ? null : udid.trim();
    }

    public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPayloadIdentifier() {
		return payloadIdentifier;
	}

	public void setPayloadIdentifier(String payloadIdentifier) {
		this.payloadIdentifier = payloadIdentifier;
	}

	public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getUnlockToken() {
        return unlockToken;
    }

    public void setUnlockToken(String unlockToken) {
        this.unlockToken = unlockToken == null ? null : unlockToken.trim();
    }
    
    public String getIosUuid() {
		return iosUuid;
	}

	public void setIosUuid(String iosUuid) {
		this.iosUuid = iosUuid;
	}
    
	public Integer getIsProfile() {
		return isProfile;
	}

	public void setIsProfile(Integer isProfile) {
		this.isProfile = isProfile;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}