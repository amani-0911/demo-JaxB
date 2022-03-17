package FromClassToXsd;

import metier.ListCompte;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class jaxbShemaGeneration {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext jaxbContext=JAXBContext.newInstance(ListCompte.class);
      
    jaxbContext.generateSchema(new SchemaOutputResolver() {
        @Override
        public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
            File f=new File("listComptes.xsd");
            StreamResult streamResult= new StreamResult(f);
            streamResult.setSystemId(f.getName());
            return streamResult;
        }
    });
    }
}
