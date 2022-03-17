package FromXMlToJava;

import metier.ListCompte;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class jaxbDeserialisationXML {

    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(ListCompte.class);
        Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
        ListCompte listCompte= (ListCompte) unmarshaller.unmarshal(new File("comptes.xml"));
       listCompte.getComptes().forEach(c->{
           System.out.println("-----------------------------");
           System.out.println("Id\tsolde\tDateCreation");
           System.out.println(c.getId()+"\t"+c.getSolde()+"\t"+c.getDateCreation());
       });
    }
}
