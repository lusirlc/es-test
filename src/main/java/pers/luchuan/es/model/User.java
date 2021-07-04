package pers.luchuan.es.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author luchuan
 */
@Data
@Accessors(chain = true)
public class User {
    private String name;
    private Integer age;
    private String sex;
}
