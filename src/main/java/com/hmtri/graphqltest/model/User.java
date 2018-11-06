package com.hmtri.graphqltest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("user")
public class User {
    @PrimaryKeyColumn(name = "partner_id", type = PrimaryKeyType.PARTITIONED, ordinal = 0)
    private String partnerId;
    @PrimaryKeyColumn(name = "user_id", type = PrimaryKeyType.CLUSTERED, ordinal = 1)
    private String userId;
    @PrimaryKeyColumn(name = "start_date", type = PrimaryKeyType.CLUSTERED, ordinal = 2, ordering = Ordering.DESCENDING)
    private Date startDate;

    @Column("end_date")
    private Date endDate;
    @Column
    private Map<String, String> field;
    @Column("ref_active_directory")
    private String refActiveDirectory;
    @Column("ref_child")
    private Map<String, String> refChild;
    @Column("user_name")
    private String userName;

    public User(String partnerId, String userId, Date startDate, String userName) {
        this.partnerId = partnerId;
        this.userId = userId;
        this.startDate = startDate;
        this.userName = userName;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Map<String, String> getField() {
        return field;
    }

    public void setField(Map<String, String> field) {
        this.field = field;
    }

    public String getRefActiveDirectory() {
        return refActiveDirectory;
    }

    public void setRefActiveDirectory(String refActiveDirectory) {
        this.refActiveDirectory = refActiveDirectory;
    }

    public Map<String, String> getRefChild() {
        return refChild;
    }

    public void setRefChild(Map<String, String> refChild) {
        this.refChild = refChild;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
