package kafka.spring.boot.kafka.consumer.model;

public class User {

    private String uid;
    private long ts;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public User() {
    }

    public User(String uid, long ts) {

        this.uid = uid;
        this.ts = ts;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("uid='").append(uid).append('\'');
        sb.append(", ts='").append(ts).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

