package by.epam.javaweb.evgeniyyaskevich.finalproject.entity;

import java.util.Objects;

//TODO: equals() and hashCode() for all entities!
public class BlackListRecord extends BaseEntity {
    private String reason;

    public BlackListRecord() {
        super();
    }

    public long getUserId() {
        return super.getId();
    }

    public void setUserId(long id) {
        super.setId(id);
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlackListRecord that = (BlackListRecord) o;
        return reason.equals(that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason);
    }

    @Override
    public String toString() {
        return "BlackListRecord{" +
                "reason='" + reason + '\'' +
                '}';
    }
}
