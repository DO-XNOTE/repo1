package cn.itcast.domain;

import lombok.Data;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class Account implements Serializable {
    private String username;
    private  String password;
    private Double money;
    private List<User> list;
    private Map<String,User> map;
}
