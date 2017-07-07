package wxtools.demo.matcher;

import com.soecode.wxtools.api.WxMessageMatcher;
import com.soecode.wxtools.bean.WxXmlMessage;

/**
 * Created by sse on 2017/7/5.
 */
public class WhoareyouMatcher implements WxMessageMatcher {
    @Override
    public boolean match(WxXmlMessage message) {
        String msg = message.getContent();
        if (null!=msg && msg.length()>0){//"你是谁".equals
            return true;
        }
        return false;
    }
}
