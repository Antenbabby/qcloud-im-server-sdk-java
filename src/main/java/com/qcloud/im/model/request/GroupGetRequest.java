package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 15:43
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupGetRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("NeedFriend")
    private String needFriend;

    @JsonProperty("LastSequence")
    private Integer lastSequence;

    @JsonProperty("GroupName")
    private List<String> groupName;

    public GroupGetRequest() {
    }

    public GroupGetRequest(String fromAccount, String needFriend, Integer lastSequence, List<String> groupName) {
        this.fromAccount = fromAccount;
        this.needFriend = needFriend;
        this.lastSequence = lastSequence;
        this.groupName = groupName;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getNeedFriend() {
        return needFriend;
    }

    public void setNeedFriend(String needFriend) {
        this.needFriend = needFriend;
    }

    public Integer getLastSequence() {
        return lastSequence;
    }

    public void setLastSequence(Integer lastSequence) {
        this.lastSequence = lastSequence;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<String> groupName) {
        this.groupName = groupName;
    }
}