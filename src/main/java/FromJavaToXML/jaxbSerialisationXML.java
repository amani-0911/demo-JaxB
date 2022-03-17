package FromJavaToXML;

import metier.Compte;
import metier.ListCompte;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class jaxbSerialisationXML {
    public static void main(String[] args) throws JAXBException {
      //  Compte compte=new Compte(1l,9000,new Date());

        ListCompte listCompte=new ListCompte();
        listCompte.addCompte(new Compte(1l,9000,new Date()));
        listCompte.addCompte(new Compte(2l,8000,new Date()));
        listCompte.addCompte(new Compte(3l,7000,new Date()));

        JAXBContext jaxbContext=JAXBContext.newInstance(ListCompte.class);
        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(listCompte,System.out);
        marshaller.marshal(listCompte,new File("comptes.xml"));
    }
}
