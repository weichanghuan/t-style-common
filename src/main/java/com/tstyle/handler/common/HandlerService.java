/**
 * 
 */
package com.tstyle.handler.common;

import java.util.Map;

/**
 * Handler服务接口
 * 
 * @author jiong.peng
 *
 */
public interface HandlerService {

    BaseResponse execute(Map<String, Object> requestMap);

}
