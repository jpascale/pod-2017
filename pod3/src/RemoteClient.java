import ar.edu.itba.pod.rmi.def.e2.GenericService;

import java.rmi.Naming;

public class RemoteClient {
    public static void main(String[] args) throws Exception{
        final GenericService service = (GenericService) Naming.lookup("//0.0.0.0:1099/service");

        for (int i = 0; i < 4; i++) {
            service.addVisit();
        }

        System.out.println("visits " + service.getVisitCount());
    }
}