package org.example.rabbit_mq.model;

import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {

    private String notificationId;
    private Date notificationCreationDate;
    private Boolean seen;
    private String message;

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public Date getNotificationCreationDate() {
        return notificationCreationDate;
    }

    public void setNotificationCreationDate(Date notificationCreationDate) {
        this.notificationCreationDate = notificationCreationDate;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", notificationCreationDate=" + notificationCreationDate +
                ", seen=" + seen +
                ", message='" + message + '\'' +
                '}';
    }
}
