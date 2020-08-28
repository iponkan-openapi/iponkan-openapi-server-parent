package cn.iponkan.openapi.service.processors;

/**
 * @author dongtangqiang
 */
public interface Processor<S, T> {
    T process(S source) throws Exception;
}
