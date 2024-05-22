package com.nami.codesandbox.model;

import lombok.Data;
import org.apache.catalina.valves.LoadBalancerDrainingValve;

/**
 * 进程执行信息
 *
 * @author nami
 */
@Data
public class ExecuteMessage {

    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;

    private Long memory;

}
