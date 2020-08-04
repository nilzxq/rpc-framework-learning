package github.netty.kyro.dto;

import lombok.*;

/**
 * 服务端响应实体类
 * @Author nilzxq
 * @Date 2020-08-04 15:31
 */
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Builder
@ToString
public class RpcResponse {
    private String message;
}
