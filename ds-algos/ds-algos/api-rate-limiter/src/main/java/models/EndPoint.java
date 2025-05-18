package models;

public class EndPoint {
    private String path;
    private String httpType;

    public EndPoint(String path, String httpType) {
        this.path = path;
        this.httpType = httpType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getHttpType() {
        return httpType;
    }

    public void setHttpType(String httpType) {
        this.httpType = httpType;
    }
}
