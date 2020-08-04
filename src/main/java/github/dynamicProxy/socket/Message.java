package github.dynamicProxy.socket;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author nilzxq
 * @Date 2020-08-04 14:43
 */
@Data
@AllArgsConstructor
public class Message implements Serializable {
    private String content;
}
