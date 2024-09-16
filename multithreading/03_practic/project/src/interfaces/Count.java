package interfaces;

public class Count {
    private int userId;
    private int count;

    public Count(int userId, int count) {
        this.userId = userId;
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return this.userId;
    }
}
