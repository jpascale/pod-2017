package ar.edu.itba.pod.rmi.def.e4;

import java.rmi.Naming;

public class RemoteClient {
    public static void main(String[] args) throws Exception{
        
        final GenericService service = (GenericService) Naming.lookup("//localhost:1099/service");

        // for (int i = 0; i < 4; i++) {
        //    service.addVisit();
        // }

        service.addToServiceQueue("Juan");
        service.addToServiceQueue("Jorge");
        service.addToServiceQueue("Katarzyna");
        service.addToServiceQueue("Juanek");

        System.out.println(service.getFirstInServiceQueue());
        System.out.println(service.getFirstInServiceQueue());

        User user = new User();
        user.setId("Id");
        user.setName("Name");

        service.addToUserQueue(user);
        System.out.println(service.getFirstInUserQueue().getName());


        // System.out.println("visits " + service.getVisitCount());
    }
}