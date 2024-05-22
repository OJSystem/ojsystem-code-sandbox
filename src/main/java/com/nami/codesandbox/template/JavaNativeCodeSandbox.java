package com.nami.codesandbox.template;

import com.nami.codesandbox.model.ExecuteCodeRequest;
import com.nami.codesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * 原生Java代码沙箱 - 实现模板方法
 *
 * @author nami
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {


    /**
     * 执行程序
     * @param executeCodeRequest
     * @return
     */
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
