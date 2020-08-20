
package cnabookstore.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="bookInventory", url="${api.url.book}")
public interface BookService {

    @RequestMapping(method= RequestMethod.GET, path="/books/{bookId}")
    public Book queryBook(@PathVariable("bookId") Long bookId);
}