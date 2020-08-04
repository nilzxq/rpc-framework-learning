package github.netty.kyro.dto;

import lombok.*;

/**
 * 客户端请求实体类
 * @Author nilzxq
 * @Date 2020-08-04 15:30
 */
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Builder
@ToString
public class RpcRequest {
    private String interfaceName;
    private String methodName;
}
