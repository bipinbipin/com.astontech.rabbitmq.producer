package demo;


import java.io.Serializable;

/**
 * Created by bipin on 4/25/2017.
 */
public class MessagePOJO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer version;

    String name;
    String status;

    public MessagePOJO() {
    }

    public MessagePOJO(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
