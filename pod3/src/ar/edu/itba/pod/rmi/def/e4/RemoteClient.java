package ar.edu.itba.pod.rmi.def.e4;

import java.rmi.Naming;

public class RemoteClient {
    public static void main(String[] args) throws Exception{

        
        final GenericService service = (GenericService) Naming.lookup("//localhost:1099/service");

        for (int i = 0; i < 4; i++) {
            service.addVisit();
        }

        System.out.println("visits " + service.getVisitCount());
    }
}