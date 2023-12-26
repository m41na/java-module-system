package works.hop.jms.greeting.provider;

import works.hop.jms.greet.spi.Greeting;

import java.nio.file.ProviderNotFoundException;
import java.util.Iterator;
import java.util.ServiceLoader;

public class GreetingService {

    public static ServiceLoader<Greeting> loader = ServiceLoader.load(Greeting.class);

    public static Iterator<Greeting> providers(boolean refresh) {
        if (refresh) {
            loader.reload();
        }
        return loader.iterator();
    }

    public static Greeting load(String language) {
        Iterator<Greeting> iter = providers(true);
        while (iter.hasNext()) {
            Greeting svc = iter.next();
            if (svc.language().equals(language)) {
                return svc;
            }
        }
        throw new ProviderNotFoundException(String.format("Content provider for %s not found", language));
    }
}