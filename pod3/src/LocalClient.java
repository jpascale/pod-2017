import ar.edu.itba.pod.concurrency.e1.GenericService;
import ar.edu.itba.pod.concurrency.e1.ProvidedGenericServiceImpl;

public class LocalClient {

    // private static Logger logger = LoggerFactory.getLogger(LocalClient.class);
    public static void main(final String[] args){
        final GenericService service = new ProvidedGenericServiceImpl();
        for (int i = 0; i < 4; i++) {
            service.addVisit();
        }
        // logger.info("visits {}", service.getVisitCount());
        System.out.println("visits " + service.getVisitCount());
    }
}