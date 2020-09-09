
package cnabookstore.order.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="coupon", url="${api.url.coupon}")
public interface CouponService {

    @RequestMapping(method= RequestMethod.GET, path="/coupons/{couponId}")
    public Coupon queryCounpon(@PathVariable("couponId") Long couponId);
}